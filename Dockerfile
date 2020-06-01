FROM openjdk:latest
ADD healthcarev1_0.jar healthcarev1_0.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","healthcarev1_0.jar"]
