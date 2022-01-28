
FROM openjdk:17
EXPOSE 8092
ADD target/sale-point-service.jar service-template.jar
ENTRYPOINT ["java","-jar","/service-template.jar"]
