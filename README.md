# EmployeeMVC

A **Spring MVC-based Employee Management System** built with Java and Spring Boot. The application demonstrates the fundamentals of MVC architecture, CRUD operations, database integration, Thymeleaf-based UI, and server-side form handling.

## 🚀 Features

* 👤 Add new employees
* 📋 View employee records
* ✏️ Update employee information
* 🗑️ Delete employees
* 🔍 Manage employee details through a web interface
* 🧩 Spring MVC architecture
* 🗄️ Database integration using JPA/Hibernate
* 🎨 Thymeleaf-based frontend
* 📱 Responsive UI
* ⚡ Spring Boot application

## 🛠️ Technologies Used

| Technology      | Purpose               |
| --------------- | --------------------- |
| Java            | Backend development   |
| Spring Boot     | Application framework |
| Spring MVC      | MVC architecture      |
| Spring Data JPA | Database operations   |
| Hibernate       | ORM                   |
| Thymeleaf       | Server-side UI        |
| HTML5           | Web structure         |
| CSS3            | Styling               |
| Maven           | Dependency management |
| Git & GitHub    | Version control       |

## 🏗️ Project Architecture

The project follows the **Model-View-Controller (MVC)** design pattern.

```text
EmployeeMVC
│
├── src
│   └── main
│       ├── java
│       │   └── com.example.employeemvc
│       │       ├── controller
│       │       ├── model
│       │       ├── repository
│       │       └── service
│       │
│       └── resources
│           ├── templates
│           ├── static
│           └── application.properties
│
├── pom.xml
└── README.md
```

### MVC Flow

```text
User
  ↓
Controller
  ↓
Service
  ↓
Repository
  ↓
Database
  ↓
Repository
  ↓
Service
  ↓
Controller
  ↓
Thymeleaf View
  ↓
User
```

## ⚙️ How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/mohit-singhoi/EmployeeMVC.git
```

### 2. Open the Project

Open the project in:

* Spring Tool Suite
* Eclipse
* IntelliJ IDEA
* VS Code

### 3. Configure Database

Update your database configuration in:

```text
src/main/resources/application.properties
```

Configure the required database URL, username, and password according to your local environment.

### 4. Build the Project

Using Maven:

```bash
./mvnw clean install
```

On Windows:

```bash
mvnw.cmd clean install
```

### 5. Run the Application

```bash
./mvnw spring-boot:run
```

On Windows:

```bash
mvnw.cmd spring-boot:run
```

The application will normally start on:

```text
http://localhost:8080
```

## 📌 CRUD Operations

### Create Employee

Users can enter employee information through the employee form and save the record to the database.

### Read Employee

The application displays stored employee records in the employee management interface.

### Update Employee

Existing employee information can be edited and updated.

### Delete Employee

Employees can be removed from the database through the delete operation.

## 🎯 Learning Objectives

This project was developed to strengthen practical knowledge of:

* Spring Boot
* Spring MVC
* MVC architecture
* Dependency Injection
* Spring Data JPA
* Hibernate ORM
* CRUD operations
* Thymeleaf
* Form handling
* Database connectivity
* Maven
* Git and GitHub

## 🔮 Future Improvements

* 🔐 User authentication and authorization
* 🔎 Employee search and filtering
* 📄 Pagination
* 📊 Employee dashboard
* ✅ Form validation
* 🌐 REST API integration
* ☁️ Cloud deployment
* 📱 Improved responsive design

## 👨‍💻 Author

**Mohit Singhoi**

MCA Graduate | Java Developer | Full Stack Developer | AI & ML Enthusiast

### Skills

`Java` `Spring Boot` `Spring MVC` `Hibernate` `JPA` `SQL` `HTML` `CSS` `JavaScript` `Python` `AI/ML`

## ⭐ Support

If you find this project useful, consider giving the repository a ⭐ on GitHub.

---

**EmployeeMVC** — A practical Spring MVC project demonstrating Java-based web application development and CRUD functionality.

