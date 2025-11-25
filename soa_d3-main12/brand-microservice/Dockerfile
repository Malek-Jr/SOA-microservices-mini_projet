#Start with a base image containing Java runtime
FROM openjdk:21-ea
#Information around who maintains the image
LABEL "org.opencontainers.image.authors"="malek.com"
# Add the application's jar to the image
COPY target/brand-microservice-0.0.1-SNAPSHOT.jar brand-microservice-0.0.1-SNAPSHOT.jar
# execute the application
ENTRYPOINT ["java", "-jar", "brand-microservice-0.0.1-SNAPSHOT.jar"]