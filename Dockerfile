FROM maven:3.9.8-eclipse-temurin-21 AS build

COPY src /build/src
COPY pom.xml /build/

WORKDIR /build
RUN mvn clean package -Dmaven.test.skip 

FROM openjdk:21 AS runner
COPY --from=build build/target/demo-0.0.1-SNAPSHOT.jar /demo.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "demo.jar"]
