FROM maven:3-eclipse-temurin-21-alpine AS build
LABEL authors="dabbi"
COPY . .
RUN mvn -f /secret-santa/pom.xml clean package -DskipTests

FROM openjdk:21-jdk-slim
COPY --from=build /secret-santa/target/secret-santa-0.0.1-SNAPSHOT.jar.original secret.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar","secret.jar"]

FROM jenkins/jenkins:lts

# Install tini
USER root
RUN apt-get update && apt-get install -y tini

# Set the entry point
ENTRYPOINT ["/usr/bin/tini", "--", "/usr/local/bin/jenkins.sh"]

# Switch back to the jenkins user
USER jenkins


