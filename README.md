# E-Commerce Application - Product Management Module

## Overview
This is a simple Spring Boot-based e-commerce application that manages product-related operations such as adding, updating, deleting, and searching for products.

## Features
- Add new products
- View all products
- Search products by name
- View product details by ID
- Edit and update product details
- Delete products

## Technologies Used
- **Spring Boot** - Backend framework
- **Spring MVC** - For handling web requests
- **Spring Data JPA** - For database interactions
- **MySQL** - Database
- **Thymeleaf** - Template engine for frontend
- **Java 17+** - Programming language
- **Maven** - Dependency management

## Installation and Setup
1. **Clone the repository**
   ```sh
   git clone https://github.com/yourusername/Eapp.git
   ```
2. **Navigate to the project directory**
   ```sh
   cd Eapp
   ```
3. **Configure the database**
   - Open `application.properties` in `src/main/resources`
   - Set up your MySQL database credentials:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/eapp
     spring.datasource.username=root
     spring.datasource.password=yourpassword
     spring.jpa.hibernate.ddl-auto=update
     ```
4. **Run the application**
   ```sh
   mvn spring-boot:run
   ```

## API Endpoints
| Method | Endpoint         | Description |
|--------|----------------|-------------|
| GET    | `/`            | Home page |
| GET    | `/productlist` | View all products |
| GET    | `/search?query=xyz` | Search for products |
| GET    | `/add1`        | Show add product form |
| POST   | `/add`         | Add new product |
| GET    | `/specific/{id}` | View product details |
| GET    | `/delete/{id}` | Delete product by ID |
| GET    | `/edit/{id}`   | Edit product page |
| POST   | `/update/{id}` | Update product details |

## Project Structure
```
Eapp
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── com.example.Eapp
│   │   │   │   ├── productcontroller
│   │   │   │   │   ├── productcontroller.java
│   │   │   │   ├── products
│   │   │   │   │   ├── products.java
│   │   │   │   ├── productservice
│   │   │   │   │   ├── productservice.java
│   │   ├── resources
│   │   │   ├── templates
│   │   │   │   ├── index.html
│   │   │   │   ├── addpdt.html
│   │   │   │   ├── pdtlist.html
│   │   │   │   ├── specific.html
│   │   │   │   ├── editpdt.html
│   │   │   │   ├── error.html
│   │   │   ├── application.properties
├── pom.xml
```

## Contribution
Feel free to fork this repository and contribute. If you find any bugs or have feature requests, please open an issue.

## License
This project is licensed under the MIT License.

---
### Author
Developed by MURUGAN, USERNAME-Neo123-321: - GitHub link:
