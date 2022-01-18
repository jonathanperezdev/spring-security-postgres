# Spring Security with Postgresql and Jwt
This project contains an example of Spring Security that stores users, and roles in a Postgresql database, the idea is, 
after [create a user endpoint](http://localhost:8080/api/auth/signup), you can use [logging endpoint](http://localhost:8080/api/auth/signing) 
and it will give you a JWT Token, this token is sent in all request to the server who validates the JWT Token and extracts the user id 
to validate if this user exist in our application, this process is performed in AuthTokenFilter class

## Requirements
To start this example, you need a postgresql database running on
jdbc:postgresql://localhost:5432/SpringSecurityDB

Spring will create the tables automatically, but if this does not work just go to application.yml and try to change spring.jpa.hibernate.ddl-auto to create or try to add spring.jpa.hibernate.generate-ddl: true

## Postman
You can find in spring-security-postgres/postman the collection to test

## Documentation
This example is based on 
* [spring-boot-security-postgresql-jwt-authentication](https://www.bezkoder.com/spring-boot-security-postgresql-jwt-authentication/)
* [github](https://github.com/bezkoder/spring-boot-security-postgresql)