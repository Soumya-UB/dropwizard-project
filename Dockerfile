FROM openjdk:15-alpine

COPY target/dropwizard-project-0.0.1-SNAPSHOT.jar /my-app.jar
COPY tasklist-service.yml /tasklist-service.yml
CMD ["java", "-jar", "/my-app.jar", "server", "tasklist-service.yml"]