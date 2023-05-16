FROM amazoncorretto:20-alpine-jdk

MAINTAINER Juanmasisti
COPY target/porfolio-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]