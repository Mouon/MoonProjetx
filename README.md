# Moon 프로젝트

Moon 프로젝트는 개인 프로젝트로, AI 채팅 기능과 로그인/로그아웃, 회원가입/탈퇴, 일정관리 등을 구현한 웹 애플리케이션입니다.

## 기술 스택

- Java
- Spring Framework (Spring Boot)
- Spring Security
- JPA (Java Persistence API)
- RestTemplate
- Thymeleaf (템플릿 엔진)
- OpenAI API

## 프로젝트 설명
<img width="1511" alt="스크린샷 2024-01-15 오후 12 25 51" src="https://github.com/Mouon/MoonProjetx/assets/137624597/a0f4c94d-78e7-4a22-8f21-99d05ebb76f5">

이 프로젝트는 다음과 같은 기능과 설정을 포함하고 있습니다:

- AI 채팅 기능: OpenAI API를 활용하여 사용자와 대화하는 기능을 구현하였습니다.
- AI 채팅 기능2: 사용자와 대화 AI가 특정 성격이 있어 가끔 지루함을 달래줍니다..(실용적이게 활용할 서비스 구상중)
- <img width="1511" alt="스크린샷 2024-01-15 오후 12 31 30" src="https://github.com/Mouon/MoonProjetx/assets/137624597/18c38db9-e747-4d6a-a4af-aee9c5313199">
<img width="1511" alt="스크린샷 2024-01-15 오후 12 31 07" src="https://github.com/Mouon/MoonProjetx/assets/137624597/fb630300-f072-422f-8645-c0ca45625262">
<img width="1511" alt="스크린샷 2024-01-15 오후 12 31 47" src="https://github.com/Mouon/MoonProjetx/assets/137624597/3e78d1b3-2090-476d-b91d-b4747536a678">

- AI 추천 서비스: 오늘의 일정을 바탕으로 한마디(?) 해줍니다.
- 일정 관리 서비스: 일정을 추가,수정,삭제 할 수 있으며, 오늘의 일정만 필터링해서 보거나 전체 조회 기능 또한 있습니다.
- 일정 관리 서비스2: 오늘의 일정은 메인 페이지에서 따로 로드 됩니다.
- 북마크: 개인 비서 사이트 답게 자주가는 사이트는 북마크로 등록할 수 있습니다.
- 로그인/로그아웃: Spring Security를 활용하여 로그인과 로그아웃 기능을 구현하였습니다.
- 회원가입: 사용자가 회원으로 가입할 수 있도록 회원가입 기능을 제공합니다.
- 회원탈퇴: 사용자가 회원으로 탈퇴할 수 있도록 회원가입 기능을 제공합니다.

- 프로젝트 커뮤니티: 자신의 프로젝트를 주요 기술과 함께 게시할 수 있습니다.
  ![Uploading 스크린샷 2024-01-15 오후 11.13.08.png…]()


-   데이터베이스: 기반은 MySQL이며, JPA를 사용하여 데이터를 관리하고있습니다.

## 공공데이터 포털 활용 예정

향후 이 프로젝트에서는 공공데이터 포털을 활용하여 더욱 유용한 기능을 추가할 예정입니다. 다양한 공공 데이터를 활용하여 실용적인 기능을 개발하고, 사용자에게 가치 있는 정보와 서비스를 제공할 계획입니다.

## 사용 방법

프로젝트를 로컬 환경에서 실행하려면 다음 단계를 따르세요:

1. 이 저장소를 클론합니다.
2. 환경 변수 `OPEN_AI_KEY`에 OpenAI API 키를 설정합니다.
3. 프로젝트를 빌드하고 실행합니다.
4. 브라우저에서 `http://localhost:포트번호`로 접속하여 웹 애플리케이션을 사용합니다.

## 기여

이 프로젝트에 기여하고 싶다면, 다음과 같은 방법으로 기여할 수 있습니다:

- 버그 리포트
- 기능 제안
- 코드 개선 및 리뷰
- 문서 업데이트





