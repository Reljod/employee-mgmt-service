# Development Guide

### Prerequisites
1. Install Java 17.
2. Install Liquibase 4.X.X.
3. Install Docker and Docker Compose.

## Get Started
1. Make sure to finish the [Prerequisites](#prerequisites).
2. Build the project.
```sh
./mvnw clean package -DskipTests
```
3. Create PostgreSQL server.
```sh
docker compose up -d db
```
4. Create New Database. *You can use DB Editors to open the server and create new database.*
```sh
CREATE DATABASE employee_db;
```
5. Update database via template.
```sh
liquibase status --changelog-file=./templates/db/prod/changelog.xml --url=jdbc:postgresql://localhost:5432/employee_db --username=user --password=password

liquibase update --changelog-file=./templates/db/prod/changelog.xml --url=jdbc:postgresql://localhost:5432/employee_db --username=user --password=password
```
6. Spin up the application.
```sh
docker compose up -d app
```
7. We can now check the application.
```sh
curl http://localhost:8080/actuator/health
```
