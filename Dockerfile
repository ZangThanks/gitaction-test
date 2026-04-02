FROM openjdk:21-jdk-slim

EXPOSE 8080

ADD target/gitaction-test.jar gitaction-test.jar

ENTRYPOINT ["java","-jar","/gitaction-test.jar"]