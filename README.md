# CableVision Converter

Restful application to convert numbers!

Using [spring-boot](http://projects.spring.io/spring-boot/) to provide a self-executable jar application.

## Instalation

`./mvnw clean package`

## Execution

`./mvnw spring-boot:run`

OR

`java -jar target/cablevision-*.jar`

## Test

- Check if the app is running
```
$ curl http://localhost:8080
cablevision-converter-0.0.1-SNAPSHOT
```

- Check simple conversion
```
$ curl -X POST -H "Accept: application/json" -H "Content-Type: application/json" -d '{"number":{"base":"dec","val":7867}}' http://localhost:8080/converter
{"number":{"base":"hex","val":"1ebb"}}
```
