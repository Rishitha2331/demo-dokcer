FROM openjdk:8
EXPOSE 8090
ADD target/demo-docker.jar demo-docker.jar
ENTRYPOINT ["java", "-jar", "/demo-docker.jar"]