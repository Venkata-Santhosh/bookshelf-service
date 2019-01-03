FROM openjdk:8
ADD target/bookshelf-service.jar bookshelf-service.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "bookshelf-service.jar"]