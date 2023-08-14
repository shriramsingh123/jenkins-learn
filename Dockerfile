FROM openjdk:17
EXPOSE 8080
ADD target/jenkins-learn.jar jenkins-learn.jar
ENTRYPOINT ["java","-jar","/jenkins-learn.jar"]