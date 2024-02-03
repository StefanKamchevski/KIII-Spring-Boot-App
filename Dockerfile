FROM openjdk:17
EXPOSE 8080
ADD /target/springboot_app.jar springboot_app.jar
ENTRYPOINT ["java","-jar","/springboot_app.jar"]