FROM openjdk:17
EXPOSE 8082
ADD target/AmdocsSpringProject.jar AmdocsSpringProject.jar 
ENTRYPOINT ["java","-jar","/AmdocsSpringProject.jar"]
