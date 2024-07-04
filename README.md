# spring-boot-actuator-demo
Spring boot actuator demo from : https://spring.io/guides/gs/actuator-service

some from here too: https://www.baeldung.com/spring-boot-actuators

This guide takes you through creating a “Hello, world” RESTful web service with Spring Boot Actuator. You will build a service that accepts the following HTTP GET request:

    curl http://localhost:9000/hello-world

    http://localhost:9001/actuator

    curl http://localhost:9001/actuator/health

    curl http://localhost:9001/actuator/metrics
    curl http://localhost:9001/actuator/metrics/jvm.info

    curl http://localhost:9001/actuator/beans
    curl http://localhost:9001/actuator/logfile 
    curl http://localhost:9001/actuator/loggers 
    curl http://localhost:9001/actuator/sessions 
    curl http://localhost:9001/actuator/env 
    curl http://localhost:9001/actuator/heapdump    
    curl http://localhost:9001/actuator/info 

    Custom endpoint:
    curl http://localhost:9001/actuator/features


It responds with the following JSON:

    {"id":1,"content":"Hello, World!"}

./gradlew clean build | java -jar .\build\libs\spring-boot-actuator-demo-0.0.1-SNAPSHOT.jar
