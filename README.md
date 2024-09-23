# Employee Management System - CRUD API

This project is a simple Employee Management System built using Spring Boot. It provides basic CRUD (Create, Read, Update, Delete) operations for managing employee data. The application is structured with layered architecture, including Controller, Service, and Repository layers, and includes comprehensive exception handling to manage common application errors.

# Features
# Create Employee: Add new employees to the database.
# Read Employee(s): Fetch details of a specific employee or all employees.
# Update Employee: Modify the details of an existing employee.
# Delete Employee: Remove an employee from the database.
# Exception Handling: Graceful error handling with informative error messages (e.g., when trying to fetch a non-existing employee).

# Technologies Used
Java: Language for the project.
Spring Boot: Framework for building the RESTful API.
Spring Data JPA: For database interactions using JPA.
H2 Database: In-memory database used for quick setup (can be configured for other databases like MySQL, PostgreSQL).
Maven: Dependency management.
Spring Boot DevTools: For hot-reloading during development.

# Project Structure
The project follows a layered architecture:

Controller Layer: Handles incoming HTTP requests and maps them to the appropriate service methods.
Service Layer: Contains the business logic for managing employees.
Repository Layer: Manages database operations using Spring Data JPA.
Exception Handling: Provides custom exceptions and a global exception handler to catch and respond to various errors.


# Project Structure:

src
 └── main
     ├── java
     │   └── com
     │       └── example
     │           ├── employee
     │           │   ├── controller
     │           │   ├── model
     │           │   ├── exception
     │           │   ├── repository
     │           │   └── service
     └── resources
         └── application.properties

# Endpoints
1. Create Employee
Endpoint: POST /api/employees
Description: Create a new employee.
Request Body:

{
  "name": "John Doe",
  "position": "Developer",
  "salary": 50000
}

Response: Returns the created employee details.

# 2. Get All Employees
Endpoint: GET /api/employees
Description: Fetch all employee records.
Response: List of all employees.

# 3. Get Employee by ID
Endpoint: GET /api/employees/{id}
Description: Fetch a specific employee by their ID.
Response: Employee details.

# 4. Update Employee
Endpoint: PUT /api/employees/{id}
Description: Update the details of an existing employee.
Request Body:
{
  "name": "Jane Doe",
  "position": "Senior Developer",
  "salary": 60000
}

# 5.Delete Employee
Endpoint: DELETE /api/employees/{id}
Description: Delete an employee by their ID.
Response: Success message on successful deletion.

# Exception Handling
EmployeeNotFoundException: Thrown when trying to retrieve or manipulate an employee that doesn't exist.
GlobalExceptionHandler: Captures unhandled exceptions and returns appropriate error messages.
For example:

If you try to fetch a non-existent employee, you will receive:

{
  "message": "Employee not found with ID: {id}"
}

# Getting Started
# Prerequisites:
Java 11 or higher
Maven for dependency management
IDE (e.g., IntelliJ, Eclipse)

# Running the Project
1.Clone the repository

git clone https://github.com/LokeshChoudhary2518/employee-crud-operation.git

# 2.Navigate to the project directory:

cd employee-crud-operation

# 3.Run the application:

mvn spring-boot:run

# Configuring Database

To switch to a different database (like MySQL, PostgreSQL), update the application.properties file with your database connection details:

spring.datasource.url=jdbc:mysql://localhost:3306/employeedb
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update

# Testing
You can use Postman or cURL to interact with the API. Here's a sample cURL request for creating an employee:

curl -X POST http://localhost:8081/api/employees \
-H "Content-Type: application/json" \
-d '{"name": "John Doe", "position": "Developer", "salary": 50000}'


# Conclusion
This project demonstrates a basic employee management system using Spring Boot. You can further extend this project by adding features like:

# User Authentication (using Spring Security)
# Pagination and Sorting
# Detailed Logging
# Swagger Integration for API Documentation

