FROM maven:3-openjdk-17-slim AS build
WORKDIR /app
COPY . ./project
RUN mvn -f /app/project/pom.xml clean package

##
FROM openjdk:17-jdk-alpine AS run
ENV SERVER_PORT=8080
WORKDIR /home
COPY --from=build  /app/project/target/docker-lab-jar-with-dependencies.jar front.jar
ENTRYPOINT ["java" , "-jar" ,"front.jar"]
