# First Stage: Build Stage
FROM maven:3-eclipse-temurin-21-alpine AS build
LABEL authors="dabbi"
COPY . /secret-santa
WORKDIR /secret-santa
RUN mvn -f /secret-santa/pom.xml clean package -DskipTests

# Second Stage: Runtime Stage
FROM openjdk:21-jdk-slim
COPY --from=build /secret-santa/target/secret-santa-0.0.1-SNAPSHOT.jar secret.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "secret.jar"]
