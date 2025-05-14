FROM openjdk:17-jdk-slim
WORKDIR /
COPY  build/libs/Tree-1.0-SNAPSHOT.jar /app/Tree-1.0-SNAPSHOT.jar

CMD ["java", "-jar", "/app/Tree-1.0-SNAPSHOT.jar"]