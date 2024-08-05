FROM maven:3-eclipse-temurin-21-alpine AS build
LABEL authors="dabbi"
COPY . .
WORKDIR /secret-santa
RUN mvn clean package -DskipTests

FROM openjdk:21-jdk-slim
COPY --from=build /target/secret-santa-0.0.1-SNAPSHOT.jar secret.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar","secret.jar"]
