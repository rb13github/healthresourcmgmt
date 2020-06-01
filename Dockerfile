FROM openjdk:latest
ADD target/healthcarev1_0.jar healthcarev1_0.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","healthcarev1_0.jar"]