FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/analytics-service-1.0.0.jar app.jar

EXPOSE 8088

ENTRYPOINT ["java", "-jar", "app.jar"]