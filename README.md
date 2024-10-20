

# Employee Role Management System

This project demonstrates a Spring Boot MVC application with integrated security using JDBC authentication. The application showcases how to authenticate and authorize users based on credentials stored in a relational database, leveraging Spring Security.

## Table of Contents
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Setup and Installation](#setup-and-installation)
- [Database Schema](#database-schema)
- [How to Use](#how-to-use)
- [Contributing](#contributing)
- [License](#license)

## Features
- Spring Security integration with JDBC-based authentication.
- User credentials stored in a database for authentication.
- Role-based access control (RBAC) using predefined user roles.
- Secure login and logout mechanism.
- Simple MVC pattern with controller, service, and view layers.

## Technologies Used
- **Spring Boot 2.x**
- **Spring Security**
- **JDBC Authentication**
- **Thymeleaf** (for view rendering)
- **MySQL/PostgreSQL** (or any relational database)
- **Maven** (for project management)

## Setup and Installation

### Prerequisites:
- Java 8 or higher
- Maven 3.x
- MySQL or any relational database

### Step 1: Clone the Repository
```bash
git clone https://github.com/your-username/spring-boot-mvc-security-jdbc-authentication.git
cd spring-boot-mvc-security-jdbc-authentication
```

### Step 2: Configure the Database
1. Set up a MySQL/PostgreSQL database with the following tables:
    - **users**: stores user credentials.
    - **authorities**: stores user roles (authorities).
2. Update your database configurations (e.g., `application.properties`) to point to your database:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
```

### Step 3: Run the SQL Scripts
Run the SQL scripts located in the `sql-scripts/` directory to create the necessary tables and insert sample users.

### Step 4: Build the Project
```bash
mvn clean install
```

### Step 5: Run the Application
```bash
mvn spring-boot:run
```

## Database Schema
Here’s a simplified version of the database schema required for the application:

```sql
CREATE TABLE users (
    username VARCHAR(50) NOT NULL PRIMARY KEY,
    password VARCHAR(100) NOT NULL,
    enabled TINYINT NOT NULL
);

CREATE TABLE authorities (
    username VARCHAR(50) NOT NULL,
    authority VARCHAR(50) NOT NULL,
    FOREIGN KEY (username) REFERENCES users(username)
);
```

You can adjust this schema based on your preferred database.

## How to Use
- Navigate to `http://localhost:8080/`.
- Use the predefined credentials from the SQL script to log in.
- Upon login, users will be directed to appropriate views based on their roles.

### Default Credentials:
- **Admin User**: username: `admin`, password: `admin123`
- **Regular User**: username: `user`, password: `user123`

## Contributing
Contributions are welcome! If you'd like to improve the project or fix a bug, please fork the repository and create a pull request with your changes.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.
```"# Employee-Role-Management-System" 
