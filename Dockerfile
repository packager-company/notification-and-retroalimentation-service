FROM maven:3.8.1-openjdk-17 AS build
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline

COPY src ./src
RUN mvn clean install -X

FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/target/your-artifact.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
