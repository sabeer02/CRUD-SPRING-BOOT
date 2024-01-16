# Employee Management System (Spring Boot CRUD Application)

This is a simple Spring Boot CRUD (Create, Read, Update, Delete) application for managing employee records. It provides basic functionality to perform CRUD operations on employee data, including adding new employees, viewing a list of employees, updating employee information, and deleting employees from the system.

## Table of Contents
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Application Features](#application-features)
- [Technologies Used](#technologies-used)
- [Usage](#usage)
- [Contributing](#contributing)

## Prerequisites

Before you begin, ensure you have met the following requirements:
- Java Development Kit (JDK) installed (version 8 or higher)
- MySQL
- Maven installed
- IDE (preferably IntelliJ IDEA or Eclipse)
- MySQL Workbench (Suggested)
- Git (optional, if you want to clone the repository)

## Getting Started

To run this application locally, follow these steps:

1. Clone the repository (if you haven't done so already):

```bash
git clone https://github.com/sabeer02/CRUD-SPRING-BOOT.git
```

2. Navigate to the project directory:

```bash
cd spring-thymeleaf-crud
```

3. Build the project using Maven / Directly start the SpringBoot Application from an IDE :

```bash
mvn clean install
java -jar target/spring-thymeleaf-crud-1.0.0.jar
```


The application will start, and you can access it at http://localhost:8080 in your web browser.

## Application Features

- Create Employee: Add a new employee to the system by providing necessary details such as name, job title, and department.
- View Employees: Display a list of all employees with their details.
- Update Employee: Edit and update the information of an existing employee.
- Delete Employee: Remove an employee from the system.

## Technologies Used

- Spring Boot
- Thymeleaf (for front-end templates)
- Spring Data JPA (for database interaction)
- MySQL (can be replaced with other databases)
- Maven (for project build and dependencies management)

## Usage

1. Open your web browser and go to http://localhost:8080.
2. Use the provided functionality to perform CRUD operations on employee data.

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvement, please create an issue or submit a pull request.
