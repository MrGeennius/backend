# Utilizar una imagen base de OpenJDK 17
FROM openjdk:17-jdk-slim
MAINTAINER jay
COPY target/demo-0.0.1-SNAPSHOT.jar demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/demo-0.0.1-SNAPSHOT.jar"]
