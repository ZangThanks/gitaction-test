FROM eclipse-temurin:21-jdk-jammy

EXPOSE 8080

ADD target/gitaction-test.jar gitaction-test.jar

ENTRYPOINT ["java","-jar","/gitaction-test.jar"]