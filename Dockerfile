FROM maven:3.5-jdk-8 as BUILD

COPY src /usr/src/demo/src
COPY pom.xml /usr/src/demo/
RUN mvn -f /usr/src/demo clean package -DskipTests

FROM openjdk:8-jdk-alpine
COPY --from=build /usr/src/demo/target/*.jar demo.jar
ENTRYPOINT ["java","-jar","demo.jar"]