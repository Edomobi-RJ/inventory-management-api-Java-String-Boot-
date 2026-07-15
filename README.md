# Inventory Management System API

A RESTful Inventory Management System built with Spring Boot and PostgreSQL.

## Features

- Product Management
- Category Management
- Product-Category Relationship
- CRUD Operations
- Validation
- Global Exception Handling
- Search Products
- Pagination
- Sorting
- Low Stock Alerts
- Swagger Documentation
- Audit Fields

## Technologies

- Java 17
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven
- Swagger / OpenAPI
- Hibernate
- Jakarta Validation

## API Endpoints

### Products

| Method | Endpoint |
|---------|-----------|
| GET | /products |
| GET | /products/{id} |
| POST | /products |
| PUT | /products/{id} |
| DELETE | /products/{id} |
| GET | /products/search |
| GET | /products/low-stock |
| GET | /products/status |
| GET | /products/supplier |

## Categories

| Method | Endpoint |
|---------|-----------|
| GET | /categories |
| GET | /categories/{id} |
| POST | /categories |
| PUT | /categories/{id} |
| DELETE | /categories/{id} |

## Swagger

```
http://localhost:8080/swagger-ui/index.html
```

## Database

PostgreSQL

## Future Improvements

- React Frontend
- JWT Authentication
- Role-Based Access Control
- Docker Deployment
- Unit Testing

## Author

Edomobi Rejoice 
