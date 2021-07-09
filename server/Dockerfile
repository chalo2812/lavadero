FROM openjdk:8u252-slim
COPY /target/server-1.0-SNAPSHOT.jar .~/server.jar
ENTRYPOINT ["java", "-jar", "~/server.jar"]