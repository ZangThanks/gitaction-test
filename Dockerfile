# Build stage
FROM maven:3.9.9-eclipse-temurin-21 AS builder

WORKDIR /app

COPY pom.xml .

COPY src ./src

RUN mvn -B package -DskipTests

# Runtime stage
FROM eclipse-temurin:21-jdk-jammy

EXPOSE 8080

COPY --from=build /app/target/gitaction-test.war app.war

ENTRYPOINT ["java","-jar","/app.war"]