FROM openjdk:8
EXPOSE 8080
ADD target/spring-jenkins1.jar spring-jenkins1.jar
ENTRYPOINT ["java","-jar","/spring-jenkins1.jar"]