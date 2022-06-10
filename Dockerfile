FROM bellsoft/liberica-openjdk-alpine
EXPOSE 8080
ADD target/gestionalednd-jar-with-dependencies.jar.jar gestionalednd-jar-with-dependencies.jar.jar
ENTRYPOINT ["java","-jar","/gestionalednd-jar-with-dependencies.jar.jar"]