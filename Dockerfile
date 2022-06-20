FROM amazoncorretto:11-alpine-jdk
EXPOSE 8080 8696
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENV JAVA_TOOL_OPTIONS -agentlib:jdwp=transport=dt_socket,address=*:8696,server=y,suspend=n
ENTRYPOINT ["java","-jar","/app.jar"]