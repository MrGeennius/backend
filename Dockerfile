# Utilizar una imagen base de OpenJDK 17
FROM maven:3.8.4 AS build
COPY . .
RUN mvn clean package -DskipTests
#
#
FROM openjdk:17-jdk-slim
MAINTAINER jay
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]