FROM eclipse-temurin:17
COPY target/seven.jar eight.jar
CMD ["java","-jar","eight.jar"]
