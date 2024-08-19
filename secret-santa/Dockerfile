FROM openjdk:21-jdk-slim
COPY --from=build /secret-santa/target/secret-santa-0.0.1-SNAPSHOT.jar.original secret.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar","secret.jar"]

