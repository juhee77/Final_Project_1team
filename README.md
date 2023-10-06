# 🐶 구해줘 집사

## 🐾 프로젝트 주제

### 반려동물 케어 매칭 서비스

## ⌛️ 프로젝트 요약

|    분류     |                                                 내용                                                  |  
|:---------:|:---------------------------------------------------------------------------------------------------:|
|    주제     |                                               반려동물 관련                                               |
|    인원     |                                                  5                                                  |
|    기간     |                                       2023.08.09 ~ 2023.09.15                                       |
|   배포 링크   |                                [🔗link](http://guhaejo-jibsa.site/)                                 |
| API 문서 링크 | [🔗link](http://api.guhaejo-jibsa.site/swagger-ui/index.html)|

<br>

---
### 기획 배경
- 휴가철마다 버려지는 반려동물 🐶
- 반려동물을 케어하기 어려운 1인 가구 반려인 🐱
- 대학생의 90%가 반려동물 관련 아르바이트를 선호 😋
- 부족한 일자리 문제 해결 😥

### 기대 효과
- 바쁜 현대인을 위한 케어링 전문가 매칭 🐾
- 취미에서 수익까지 이어지는 효과 기대 💸
- 일자리 창출 효과 💡

---

## <span style="color:lightblue"> 🔨개발 환경 - 기술 스택

개발 언어 : <img src="https://img.shields.io/badge/JAVA-17-FFFFFF?style=flate&logo=openjdk&logoColor=FFFFFF">
<img src="https://img.shields.io/badge/typescript-3178C6?style=flate&logo=typescript&logoColor=FFFFFF"><br>
개발 프레임 워크: <img src="https://img.shields.io/badge/SpringBoot-3.1.1-6DB33F?style=flate&logo=SpringBoot&logoColor=6DB33F">
<img src="https://img.shields.io/badge/junit5-FFFFFF?style=flate&logo=junit5&logoColor=junit5">
<img src="https://img.shields.io/badge/springsecurity-FFFFFF?style=flate&logo=springsecurity&logoColor=6DB33F"><br>
라이브러리 : <img src="https://img.shields.io/badge/react-FFFFFF?style=flate&logo=react&logoColor=react">
<img src="https://img.shields.io/badge/vite-646CFF?style=flat&logo=Vite&logoColor=white" >
<br>
데이터베이스 : <img src="https://img.shields.io/badge/mysql-4479A1?style=flat&logo=mysql&logoColor=white" >
<img src="https://img.shields.io/badge/redis-DC382D?style=flat&logo=redis&logoColor=white" >
<img src="https://img.shields.io/badge/h2-1828f9?style=flate&logoColor=white"><br>
도구 : <img src="https://img.shields.io/badge/GitHub-181717?style=flate&logo=GitHub&logoColor=white">
<img src="https://img.shields.io/badge/Notion -000000?style=flate&logo=Notion&logoColor=white">
<img src="https://img.shields.io/badge/postman-FFFFFF?style=flate&logo=postman&logoColor=postman">
<img src="https://img.shields.io/badge/Jira Software-0052CC?style=flat&logo=jirasoftware&logoColor=white"/><br>
배포 :<img src="https://img.shields.io/badge/amazonaws-232F3E?style=flat&logo=amazonaws&logoColor=white">
<img src="https://img.shields.io/badge/amazonec2-FF9900?style=flat&logo=amazonec2&logoColor=white">
<img src="https://img.shields.io/badge/amazonrds-527FFF?style=flat&logo=amazonrds&logoColor=white">
<img src="https://img.shields.io/badge/amazons3-569A31?style=flat&logo=amazons3&logoColor=white">
<img src="https://img.shields.io/badge/docker-2496ED?style=flat&logo=docker&logoColor=white">
<img src="https://img.shields.io/badge/githubactions-2088FF?style=flat&logo=githubactions&logoColor=white"><br>
사용 기술 : <img src="https://img.shields.io/badge/socket.io-010101?style=flat&logo=socket.io&logoColor=white" > <img src="https://img.shields.io/badge/swagger-85EA2D?style=flat&logo=swagger&logoColor=white" >
<br>

--- 
## <span style="color:lightblue">👥 팀원 소개

<div>
<table>
  <tbody>
    <tr>
        <td align="center"> 팀장 </td>
        <td align="center"> 팀원 </td>
        <td align="center"> 팀원 </td>
        <td align="center"> 팀원 </td>
        <td align="center"> 팀원 </td>
    </tr>
    <tr>
     <td><img src="./docs/profile/박주희.jpeg" width="100px;" alt=""/><br> </td>
     <td><img src="./docs/profile/이민기.jpg" width="100px;" alt=""/><br> </td>
     <td><img src="./docs/profile/김도영.png" width="100px;" alt=""/><br> </td>
     <td><img src="./docs/profile/정현목.jpeg" width="100px;" alt=""/><br> </td>
     <td><img src="./docs/profile/박상도.jpg" width="100px;" alt=""/><br> </td>

   </tr>
    <tr>
      <td align="center"><a href="https://github.com/juhee77"> 박주희 </a></td>
      <td align="center"><a href="https://github.com/mon0mon"> 이민기 </a></td>
      <td align="center"><a href="https://github.com/greedyBackEnd"> 김도영 </a></td>
      <td align="center"><a href="https://github.com/Hyunmok-Chung"> 정현목</a></td>
      <td align="center"><a href="https://github.com/sangdob"> 박상도 </a></td>
    </tr>
  </tbody>
</table>
</div>

--- 
### ER 다이어그램
<img src="./docs/er-diagram.png" alt=""/>

### 플로우 차트
<img src="./docs/flow-chart.png" alt=""/>

### 시퀀스 다이어그램
<img src="./docs/sequence.png" alt=""/>

### 아키텍처 
<img src="./docs/deploy.png" alt=""/>


--- 
### 개발 내용
#### 유저
- 회원가입, 로그인, 개인 화면 수정 기능을 제공
- 네이버,구글 oauth2 로그인 기능을 제공(처음 회원가입을 하는 유저에게만 추가적인 정보입력을 할 수 있도록 함)
- 로그인시에 유저 캐싱에 저장을 하여 반복된 유저의 접근시에 레디스에서 유저를 캐싱하여가져올 수 있도록 함
- 로그인 시에 엑세스토큰과 레디스를 이용한 리프레시 토큰을 발급하여 로그인은 유지할 수 있도록 함
#### 게시글
- 모든 유저는 게시글을 작성할 수 있음
- 게시글 작성시에는 사진(s3),게시글(mysql-rds)에 저장이 됨
- 만약 판매자가 접근하면 게시글을 수정 및 삭제가 가능함
- 게시글 상세보기를 클릭하면 리뷰와 함께 게시글 확인이 가능함
- 게시글 내에서 주문, 채팅, 신고등 다양한 기능으로 연결이 됨 
#### 주문 
- 결제 이후 진행하는 과정으로 주문 과정을 진행
- 결제완료후에 판매자가 구매 확정을 클릭하여야 실제 프로세스가 진행가능함(배달의 민족 주문 확인과 같은 기능)
- 해당 확인 과정 이후에는 구매자는 취소를 하지 못하고 프로세스가 진행됨
- 프로세스 진행완료후 주문완료 버튼을 클릭하며 리뷰를 작성할 수 있음
#### 채팅
- WebSocket STOMP, Redis(pub/sub),Redis(data저장)를 이용해 구현
  - 채팅방과 채팅에 관한 데이터를 저장 후 활용
    - 채팅 기록이 있는 유저와 매칭되면 전에 있던 채팅 데이터를 불러옴
- 구매자가 게시글을 통해 판매자에 대한 채팅방 생성 및 채팅 전송
  - 이때 채팅방 생성은 이전에 동일한 유저와의 기록이 있다면 같은 채팅방을 반환함
- 채팅을 통해 구매자와 판매자 간의 시간, 날짜 등 의견 조율
- 협의 완료 후 주문을 진행하여 결제를 진행함
#### 결제
- 구매자는 판매자의 게시글을 통해 물건 혹은 서비스 구매 가능
- 결제를 위해 [토스 페이먼츠 API](https://developers.tosspayments.com/) 활용
- 핵심적으로 요청, 인증, 승인 단계를 거침
  - 요청
    - 서버로부터 구매자의 유저 정보와 구매를 희망하는 제품 및 서비스의 정보를 받아 결제 요청 정보를 입력받는 단계
    - 구매자는 위젯을 통해 카드사를 선택하고 신용카드 정보를 입력
  - 인증
    - 구매자가 선택한 결제 수단인 카드사에서 진행
    - 카드사가 요청받은 결제 정보, 즉 고객의 신용카드 정보와 결제 금액을 확인해서, 이 거래가 유효하며 결제를 허용해도 되는지 확인하는 과정
  - 승인
    - 인증된 결제를 카드사에 승인해달라고 요청하는 과정
    - 인증 결과로 돌아온 파라미터로 요청
    - 승인이 성공해야 판매자는 구매자에게 상품이나 서비스를 제공
    - 카드사나 은행은 결제 금액을 구매자에게 청구하기 때문에 실제로 결제가 마무리되는 단계
- 검증
  - 서버에서 카드사에 결제 요청 및 인증 단계 전에 결제할 데이터를 임시 저장
  - 해당 데이터를 바탕으로, 실제 거래가 이루어지는 승인 단계 과정 전에 결제 예정 금액과 비교 검사
  - 이를 통해 결제 과정 중에 발생한 가격 변동 등의 비정상적인 접근을 방지
#### 후기
- 구매자는 판매자가 주문 상태를 주문 완료(END) 상태로 업데이트 후 후기 작성 가능
- 기능 : 후기 작성, 수정, 삭제
  - 후기 작성 : 후기 내용, 별점, 이미지 첨부 가능.<br>이미지 ➡️ S3 저장<br>내용, 별점 데이터 ➡️ MySQL 저장
  - 후기 수정 : 내용, 별점, 이미지 수정 가능.<br>변경 사항 없을 시 원본 데이터 그대로 재작성
  - 후기 삭제 : Soft Delete 개념으로 삭제 시 데이터의 상태를 "DELETE"로 변경 후 조회되지 않도록 구현
#### 신고
- 유저는 타 유저의 불건전한 게시글과 리뷰를 신고
- 관리자는 신고 조회 및 관리 가능
- 상태 값 : { '검토중', '해결됨', '거절됨' }


---

## 프로젝트 실행 기간

5인 프로젝트   
1차 기간 : 2023/08/10 ~ 2023/09/14
2차 기간 : 고도화 진행중 (4인)
