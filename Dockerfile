FROM openjdk:17-jdk-slim
COPY target/spring-boot-docker-compose.jar /user/app/
WORKDIR /usr/app
EXPOSE 9090
ENTRYPOINT [ "java", "-jar", "spring-boot-docker-compose.jar" ]
