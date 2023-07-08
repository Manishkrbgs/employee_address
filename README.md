# Employee Address 
## Framework and Language

The project is developed using [SpringBoot] and written in [Java].

## Dataflow

The data flows through the system in the following manner:

1. User input is received through the [API endpoints/UI].
2. The input is processed by the [Controller classes] in the backend.
3. The Controller classes interact with the [Service classes] to perform business logic and data manipulation.
4. The Service classes communicate with the [Repository classes] to interact with the database.
5. Data is fetched or modified in the database using [ORM framework].
6. The updated data is returned back to the Service classes.
7. The Service classes pass the data to the Controllers, which generate appropriate responses.
8. The responses are sent back to the user through the [API endpoints/UI].

## Data Structure

The project uses the following data structures:

**Employee:**

- id (Long)
- firstName (String)
- lastName (String)
- address (Address)

**Address:**

- id (Long)
- street (String)
- city (String)
- state (String)
- zipcode (String)

## Project Summary

The project aims to provide CRUD (Create, Read, Update, Delete) operations for managing employees and their addresses. 
It utilizes the [ SpringBoot] framework to handle the backend development and provides RESTful API endpoints for interacting with the system.

The Employee entity represents an employee with attributes such as id, firstName, lastName, and address.
The Address entity represents the address of an employee with attributes like street, city, state, and zipcode.

The system allows users to perform the following operations:

- Get all employees
- Get an employee by id
- Create a new employee
- Update an existing employee
- Delete an employee

Similarly, the system provides similar operations for managing addresses.
