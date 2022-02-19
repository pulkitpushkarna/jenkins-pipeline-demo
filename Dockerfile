FROM tomcat:8.5.50-jdk8-openjdk

RUN apt-get update

WORKDIR /usr/local/bin

COPY ./build/libs/jenkins-pipeline-demo-0.0.1-SNAPSHOT.jar .

EXPOSE 8080

CMD ["java","-jar","jenkins-pipeline-demo-0.0.1-SNAPSHOT.jar"]

