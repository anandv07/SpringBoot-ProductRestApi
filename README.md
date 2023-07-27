# SpringBoot-ProductRestApi

This project is a Spring Boot-based RESTful API that allows users to perform CRUD (Create, Read, Update, Delete) operations on product entities. It provides endpoints to manage product information on name and price.

## Technologies

- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven

## Features And EndPoints

- Create a new product with name and price (POST /api/products)
- Retrieve a product by its ID  (GET /api/products/{id})
- Retrieve a list of all products (GET /api/products)
- Update a product's name and/or price  (PUT /api/products/{id})
- Delete a product by its ID (DELETE /api/products/{id})
