# Hibernate PostgreSQL Learning Project

This project is a basic Java application created to learn how to connect **Hibernate ORM** with **PostgreSQL**.

The project demonstrates how to:

- Configure Hibernate
- Connect Java with PostgreSQL
- Create an Entity using annotations
- Create a `SessionFactory`
- Open a Hibernate `Session`
- Use transactions
- Persist Java objects into a PostgreSQL database

## Technologies Used

- Java
- Maven
- Hibernate ORM 7.4.7.Final
- PostgreSQL 18.6
- JDBC
- Eclipse IDE

## Project Structure

```text
Hibernate
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── postgresql_connect
│   │   │       ├── Student.java
│   │   │       ├── postgresql_first.java
│   │   │       └── configuration.java
│   │   │
│   │   └── resources
│   │       └── hibernate.cfg.xml
│   │
│   └── test
│
├── pom.xml
└── README.md