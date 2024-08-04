# Basic Spring Project

This project is a basic Spring application with MVC, Security, and Spring Data support. It includes functionalities for managing `Student` and `Subject` entities, with a REST API layer, and JWT-based security for two roles: student and admin.

## Requirements

- **Java Development Kit (JDK)**: Version 19 or above
- **Maven**: For project management and build

## Project Structure

### Entities

- **Student**: `{name, address}`
- **Subject**: `{name}`
- A `Student` can enroll in multiple `Subjects`.

### Entity Relationship

- There is a many-to-many relationship between `Student` and `Subject`.

### REST API Endpoints

#### Students
- **Create a Student**: `POST /api/students`
- **Get List of all Students**: `GET /api/students`

#### Subjects
- **Get List of all Subjects**: `GET /api/subjects`

### Security

- **Roles**: `student` and `admin`
- **Authentication**: JWT-based login for both `student` and `admin`

### Database

- **Relational DB**: Using JPA
- **In-memory DB**: H2 database is used to avoid any hassle

## Getting Started

### Prerequisites

Ensure you have the following installed:
- JDK 19+
- Maven

### Installation

1. **Clone the repository**:
    ```bash
    git clone https://github.com/your-username/basic-spring-project.git
    cd basic-spring-project
    ```

2. **Build the project using Maven**:
    ```bash
    mvn clean install
    ```

### Running the Application

1. **Start the application**:
    ```bash
    mvn spring-boot:run
    ```

2. **Access the application**:
    - The application will run on `http://localhost:8080`.

### API Usage

#### Create a Student

- **Endpoint**: `POST /api/students`
- **Payload**:
    ```json
    {
      "name": "John Doe",
      "address": "123 Main St"
    }
    ```

#### Get List of All Students

- **Endpoint**: `GET /api/students`

#### Get List of All Subjects

- **Endpoint**: `GET /api/subjects`

### Security

#### Roles

- **student**
- **admin**

#### JWT-based Login

- You will need to implement a login mechanism that issues JWT tokens for authenticated users. Include the token in the `Authorization` header with the `Bearer` prefix for accessing secured endpoints.

### In-Memory Database (H2)

- The project uses H2 in-memory database for simplicity. Access the H2 console at `http://localhost:8080/h2-console` with the following details:
    - **JDBC URL**: `jdbc:h2:mem:testdb`
    - **Username**: `saksham`
    - **Password**: saksham

## Contributing

1. Fork the repository.
2. Create your feature branch (`git checkout -b feature/feature-name`).
3. Commit your changes (`git commit -m 'Add some feature'`).
4. Push to the branch (`git push origin feature/feature-name`).
5. Open a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgements

- Spring Framework
- H2 Database
- JWT

