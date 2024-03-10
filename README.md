# Dcoker Compose For Spring Boot Rest API with PostgreSQL

This application was developed to demonstrate Spring Boot with PostgreSQL with simple API.

Technologies Used

- Spring Boot 2.4.1
- Spring Data JPA
- Lombok
- PostgreSQL (another container)

How to Run this application

First change the **src/main/resources/application.properties** with your postgreSQL instance properties.

Then,

```shell
$ ./gradlew bootRun
```

or create a build using following command,

```shell
$ ./gradlew clean build
```

Then start the JAR file using java

```shell
$ java -jar build/libs/spring-boot-postgresql-base-project-0.0.1-SNAPSHOT.jar
```

Create network

```shell
$ docker network create -d bridge my_network
```

Run PostgreSQL container
```shell
$ docker run -p 5432:5432 --name postgres --network my_network -e POSTGRES_PASSWORD=password -d -v ~/pgdata:/var/lib/postgresql/data postgres
```
Run RestAPI container
```shell
$ docker run -p 8080:8080 --network my_network -d --name=spring-boot-postgresql-project-base-api_service spring-boot-postgresql-project-base-api_service
```


### Related Articles

- [Docker Compose For Spring Boot with PostgreSQL](https://javatodev.com/docker-compose-spring-boot-postgresql/)
