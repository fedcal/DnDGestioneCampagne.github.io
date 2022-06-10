FROM bellsoft/liberica-openjdk-alpine
EXPOSE 8080
ADD target/gestionalednd.jar gestionalednd.jar
ENTRYPOINT ["java","-jar","/gestionalednd.jar"]