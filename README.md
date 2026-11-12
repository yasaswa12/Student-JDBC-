# Student Management System

A console-based Student Management System developed using **Java, JDBC, and MySQL** to perform CRUD operations on student records.

## Technologies Used

- Java
- JDBC
- MySQL
- MySQL Workbench
- Eclipse
- Git & GitHub

## Features

- Add student
- View all students
- Search student by ID
- Update student details
- Delete student

## Project Structure

```text
StudentManagementSystem
│
├── DBConnection.java
├── StudentMain.java
├── StudentDAO.java
├── StudentDAOInterface.java
└── Student.java
```

## Database Setup

```sql
CREATE DATABASE j2ee;

USE j2ee;

CREATE TABLE student (
    stno INT PRIMARY KEY,
    stname VARCHAR(100) NOT NULL,
    marks INT
);
```

## JDBC Connection

The application connects to MySQL using JDBC and `PreparedStatement` for executing SQL queries.

```java
DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/j2ee",
    "root",
    "YOUR_PASSWORD"
);

## CRUD Operations

- **Create** – Insert student records
- **Read** – Retrieve all students or search by ID
- **Update** – Modify student name and marks
- **Delete** – Remove student records

## Author

**Yasaswa Ambati**

GitHub: [Yasaswa12](https://github.com/yasaswa12)
