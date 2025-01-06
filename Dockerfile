FROM openjdk:17
LABEL maintainer="piyushshende.net"
ADD target/KafkaSwingApp-0.0.1-SNAPSHOT.jar Kafka-swing.jar
ENTRYPOINT ["java", "-jar", "Kafka-swing.jar"]