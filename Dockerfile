FROM openjdk:8
COPY ./target/SPE_mini_project-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-cp", "SPE_mini_project-1.0-SNAPSHOT.jar", "Main"]