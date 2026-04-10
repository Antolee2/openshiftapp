FROM eclipse-temurin:17-jdk-alpine
WORKDIR /openshift_deploy
COPY target/externalproject-0.0.1-SNAPSHOT.jar /openshift_deploy/webapp.jar
EXPOSE 8080
CMD ["java","-jar", "/openshift_deploy/webapp.jar"]