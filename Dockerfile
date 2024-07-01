FROM maven:3.8.5-openjdk-17
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src ./src
RUN mvn clean install -X
ARG SERVER_PORT=9191
EXPOSE ${SERVER_PORT}
CMD ["java", "-jar", "target/membershipservice-0.0.1-SNAPSHOT.jar", "--server.port=${SERVER_PORT}"]
