# cf-legacy-was

### Build & Run Application

* run Application 
```
$ ./gradlew bootRun
```

* build jar & run Application 
```
$ ./gradlew build
$ java -jar build/libs/todoapi-0.0.1-SNAPSHOT.jar
```

### Usage

* Swagger URL 
```
http://localhost:8080/swagger-ui.html
```

### TODO

* BuildPack 버전 확인 
* CF 배포하는 다른 방법이 있는 지 확인 ... (배포시 빌드한다던가 ... )
* CF - SERVICE : MySQL 바인딩 하면 MySQL 로 아니면 H2 데이터베이스 사용 
* 내용을 TODO 사용 데이터로 변경 필요 ...

### Links

* [JPA Data with REST](https://spring.io/guides/gs/accessing-data-rest/)
* [한글로 된 자료](https://freedeveloper.tistory.com/25)
* [Swagger 2 with a Spring REST API](https://www.baeldung.com/swagger-2-documentation-for-spring-rest-api)