FROM openjdk:17-jdk-slim
LABEL maintainer="author@javatodev.com"
VOLUME /main-app
ADD build/libs/docker-spring-boot-base-application-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]
