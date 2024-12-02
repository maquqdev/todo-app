# Todo App

Todo App is a backend application built with Spring Boot, providing a RESTful API for managing a to-do list. The
application supports creating, reading, updating, and deleting tasks.

## Features

- Retrieve all tasks
- Get details of a specific task by ID
- Create a new task
- Update an existing task
- Delete a task

## Technology Stack

This project utilizes the following technologies:

- **Java 17**
- **Spring Boot 3**
- **Maven** as the build system
- **MongoDB** (or another database, depending on your configuration)

## API Endpoints

| Method | Endpoint          | Description                           |
|--------|-------------------|---------------------------------------|
| GET    | `/api/todos`      | Retrieves a list of all tasks         |
| GET    | `/api/todos/{id}` | Retrieves details of a task by its ID |
| POST   | `/api/todos`      | Creates a new task                    |
| PUT    | `/api/todos/{id}` | Updates an existing task              |
| DELETE | `/api/todos/{id}` | Deletes a task by its ID              |

## Configuration

### Cross-Origin Resource Sharing (CORS)

The `TodoController` contains the following annotation:

```java
@CrossOrigin("http://localhost:3001")
