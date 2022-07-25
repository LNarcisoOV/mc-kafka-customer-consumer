FROM openjdk:17-oracle
EXPOSE 8083
ADD /target/mc-kafka-customer-consumer-0.0.1-SNAPSHOT.jar mc-kafka-customer-consumer.jar
ENTRYPOINT ["java", "-jar", "mc-kafka-customer-consumer.jar"]
