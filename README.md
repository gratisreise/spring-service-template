# Gratisreise Spring Service Template - Gradle 의존성

이 프로젝트는 Spring Boot와 Spring Cloud를 기반으로 한 마이크로서비스 템플릿의 Gradle 의존성을 정리한 목록입니다. 아래는 `build.gradle`에 명시된 모든 의존성과 그 역할입니다.

## Gradle 플러그인

- **java**: Java 프로젝트 지원.
- **org.springframework.boot:3.3.13**: Spring Boot 애플리케이션 빌드 및 관리.
- **io.spring.dependency-management:1.1.7**: 의존성 버전 관리.
- **jacoco**: 코드 커버리지 분석 도구.

## Java 설정

- **Java 버전**: 17 (Java Toolchain 사용).

## 의존성 목록

### Spring Boot

- `org.springframework.boot:spring-boot-starter-web:3.3.13`
    - RESTful 웹 서비스 개발, 내장 Tomcat 서버 포함.
- `org.springframework.boot:spring-boot-starter-actuator:3.3.13`
    - 애플리케이션 모니터링 및 관리 엔드포인트 (예: `/actuator/health`).
- `org.springframework.boot:spring-boot-starter-data-jpa:3.3.13`
    - JPA를 통한 데이터베이스 접근, Hibernate 기반.
- `org.springframework.boot:spring-boot-starter-data-redis:3.3.13`
    - Redis를 사용한 캐싱 및 데이터 저장.
- `org.springframework.boot:spring-boot-starter-validation:3.3.13`
    - Hibernate Validator로 데이터 유효성 검사.
- `org.springframework.boot:spring-boot-starter-amqp:3.3.13`
    - RabbitMQ를 통한 메시지 큐 처리.
- `org.springframework.boot:spring-boot-devtools:3.3.13` (개발 환경 전용)
    - 자동 재시작 및 개발 편의 기능.

### Spring Cloud

- `org.springframework.cloud:spring-cloud-starter-config:2023.0.5`
    - 외부 Config Server에서 구성 정보 가져오기.
- `org.springframework.cloud:spring-cloud-starter-netflix-eureka-client:2023.0.5`
    - Eureka 서비스 디스커버리 클라이언트, 서비스 등록 및 검색.
- `org.springframework.cloud:spring-cloud-dependencies:2023.0.5` (BOM)
    - Spring Cloud 의존성 버전 관리.

### 모니터링 및 로깅

- `io.micrometer:micrometer-registry-prometheus`
    - Prometheus를 통한 메트릭 수집 및 모니터링.
- `io.sentry:spring-boot-starter-jakarta:8.13.2`
    - Sentry를 통한 오류 추적 및 로깅.

### API 문서화

- `org.springdoc:springdoc-openapi-starter-webmvc-ui:2.5.0`
    - Swagger UI를 통한 OpenAPI 기반 API 문서화.

### 데이터베이스

- `org.postgresql:postgresql` (런타임)
    - PostgreSQL 데이터베이스 드라이버.

### 편의성

- `org.projectlombok:lombok`
    - 보일러플레이트 코드 감소 (예: `@Getter`, `@Setter`).
    - `compileOnly` 및 `annotationProcessor`로 사용.

### 테스트

- `org.springframework.boot:spring-boot-starter-test:3.3.13`
    - JUnit, Mockito 등을 포함한 테스트 프레임워크.
- `org.springframework.amqp:spring-rabbit-test`
    - RabbitMQ 테스트 지원.
- `org.junit.platform:junit-platform-launcher` (런타임)
    - JUnit 플랫폼 실행기.

## 참고

- 의존성 버전은 `build.gradle`의 `dependencyManagement`에서 관리되며, Spring Cloud는 `2023.0.5`, Sentry는 `8.13.2` BOM을 사용.
- 자세한 설정은 `build.gradle` 파일을 참조하세요.