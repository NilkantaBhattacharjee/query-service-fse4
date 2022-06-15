FROM openjdk:8
VOLUME /tmp
ARG JAR_FILE=build/libs/query-service.jar
EXPOSE 9080
COPY ${JAR_FILE} query-service.jar
ENTRYPOINT ["java","-jar","/query-service.jar"]