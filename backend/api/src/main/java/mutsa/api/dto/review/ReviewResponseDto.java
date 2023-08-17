package mutsa.api.dto.review;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import mutsa.common.domain.models.review.Review;

@Getter
@Builder
@AllArgsConstructor
public class ReviewResponseDto {
    private String content;
    private Integer point;
    private String apiId;

    public static ReviewResponseDto fromEntity(Review review) {
        return ReviewResponseDto.builder()
            .content(review.getContent())
            .point(review.getPoint())
            .apiId(review.getApiId())
            .build();
    }
}