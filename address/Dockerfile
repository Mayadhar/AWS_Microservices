From openjdk:8-jdk-alpine
EXPOSE 8989
ARG JAR_FILE=target/address-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} address.jar
ENTRYPOINT ["java", "-jar", "address.jar"]