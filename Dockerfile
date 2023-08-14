FROM openjdk:17
ARG JAR_FILE = target/* .jar
COPY ${JAR_FILE} jenkins-learn.jar
ENTRYPOINT ["java",".jar","/jenkins-learn"]