package mutsa.api.service.review;

import java.util.Objects;
import lombok.RequiredArgsConstructor;
import mutsa.api.dto.review.ReviewDeleteDto;
import mutsa.api.dto.review.ReviewRequestDto;
import mutsa.api.dto.review.ReviewResponseDto;
import mutsa.common.domain.models.article.Article;
import mutsa.common.domain.models.order.Order;
import mutsa.common.domain.models.order.OrderStatus;
import mutsa.common.domain.models.review.Review;
import mutsa.common.domain.models.review.ReviewStatus;
import mutsa.common.domain.models.user.User;
import mutsa.common.exception.BusinessException;
import mutsa.common.exception.ErrorCode;
import mutsa.common.repository.review.ReviewRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ReviewModuleService {

    private final ReviewRepository reviewRepository;

    // 리뷰 생성
    @Transactional
    public ReviewResponseDto createReview(Article article, Order order, User user, ReviewRequestDto requestDto) {
        // 유저 검증 : Order 작성자와 현재 요청자가 동일인물인지 검증
        if (!Objects.equals(order.getUser().getId(), user.getId())) {
            throw new BusinessException(ErrorCode.REVIEW_PERMISSION_DENIED);
        }

        if (Objects.equals(order.getOrderStatus(), OrderStatus.END)) {
            return ReviewResponseDto.fromEntity(reviewRepository.save(
                Review.of(user, article, requestDto.getContent(), requestDto.getPoint()))
            );
        }

        throw new BusinessException(ErrorCode.REVIEW_NOT_ALLOW);
    }

    // 리뷰 단일 조회 (모든 유저 접근 가능)
    public ReviewResponseDto getReview(String reviewApiId) {
        Review review = getByApiId(reviewApiId);

        return ReviewResponseDto.fromEntity(review);
    }

    // 전체 리뷰 조회 (모든 유저 접근 가능)
    public Page<ReviewResponseDto> findAllReview(Article article, int pageNum, int pageSize) {
        // 생성 날짜 내림차순 정렬 후 수정 날짜 내림차순 정렬 -> 갱신순으로 출력하기 위한 정렬방식 정의
        Sort sortByCreatedAt = Sort.by("createdAt").descending();

        Sort sortByModifiedAt = Sort.by("modifiedAt").descending();

        Sort sortByCreatedAtAndModifiedAt = sortByCreatedAt.and(sortByModifiedAt);

        Pageable pageable = PageRequest.of(pageNum - 1, pageSize, sortByCreatedAtAndModifiedAt);
        Page<Review> reviewPage = reviewRepository.findByArticle(article, pageable);

        return reviewPage.map(ReviewResponseDto::fromEntity);
    }

    // 리뷰 수정
    @Transactional
    public ReviewResponseDto updateReview(User user, String reviewApiId,
        ReviewRequestDto reviewUpdateDto) {
        Review review = getByApiId(reviewApiId);
        // 유저 검증
        review.validUserById(user);

        review.setContent(reviewUpdateDto.getContent());
        review.setPoint(reviewUpdateDto.getPoint());
        review.setReviewStatus(ReviewStatus.UPDATED);

        return ReviewResponseDto.fromEntity(reviewRepository.save(review));
    }

    // 리뷰 삭제
    @Transactional
    public ReviewDeleteDto deleteReview(User user, String reviewApiId) {
        Review review = getByApiId(reviewApiId);
        // 유저 검증
        review.validUserById(user);

        reviewRepository.delete(review);

        ReviewDeleteDto dto = new ReviewDeleteDto();
        dto.setMessage("후기를 삭제했습니다.");

        return dto;
    }

    public Review getByApiId(String reviewApiId) {
        return reviewRepository.findByApiId(reviewApiId).orElseThrow(()->
            new BusinessException(ErrorCode.REVIEW_NOT_FOUND));
    }
}