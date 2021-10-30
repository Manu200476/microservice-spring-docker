
FROM openjdk:17
COPY taller-1.0-SNAPSHOT.jar /
CMD ["java", "-jar", "./taller-1.0-SNAPSHOT.jar"]