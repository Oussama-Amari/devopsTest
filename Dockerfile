FROM openjdk:11
MAINTAINER baeldung.com
COPY target/devops-integration.jar devops-integration.jar
ENTRYPOINT ["java","-jar","/app.jar"]