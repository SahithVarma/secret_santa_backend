FROM maven:3-eclipse-temurin-21-alpine

LABEL authors="dabbi"

# Set the working directory
WORKDIR /secret-santa

# Copy the project files to the container
COPY . /secret-santa

# Build the project
RUN mvn -f pom.xml clean package -DskipTests

# Expose the port the application runs on
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "/secret-santa/target/secret-santa-0.0.1-SNAPSHOT.jar"]
