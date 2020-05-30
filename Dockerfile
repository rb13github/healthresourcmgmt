FROM openjdk:latest
ADD Healthcarev1_0.jar Healthcarev1_0.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","Healthcarev1_0.jar"]