FROM maven:3.9.9-eclipse-temurin-23-noble

RUN apt-get update && \
    apt-get install -y git bash vim

WORKDIR /usr/src/exact-change

COPY . .

RUN mvn clean install

CMD ["java", "-cp", "target/classes", "com.jonpurvis.App"]
