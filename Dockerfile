FROM amazoncorretto:11-alpine-jdk
EXPOSE 8080
COPY demo.jar demo.jar
ENTRYPOINT ["java","-jar","/demo.jar"]