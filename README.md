# Contact Manager

This application enables users to store, retrieve, and edit their contact information. It consists of two main services: the **Authorization Service** and the **Contact Service**.

---

## Services Overview

### 1. **Authorization Service**
This service functions as a reverse proxy and is responsible for:
- User Authorization
- Rate Limiting
- Load Balancing

It is built using **Spring Security** with **JWT Authentication**.
| **Operation**        | **HTTP Method** | **Endpoint**       | **Description**                          |
|----------------------|-----------------|--------------------|------------------------------------------|
| Sign Up              | POST            | `/api/auth/signup` | Register a new user account.             |
| Log In               | POST            | `/api/auth/login`  | Log in with valid credentials to get a JWT token. |


### 2. **Contact Service**
This service provides endpoints for performing CRUD (Create, Read, Update, Delete) operations on a user's contact list.

| **Operation**        | **HTTP Method** | **Endpoint**               | **Description**                       |
|----------------------|-----------------|----------------------------|---------------------------------------|
| Create Contact       | POST            | `/contact/add`             | Add a new contact to the user's list. |
| Retrieve Contacts    | GET             | `/contact/get`             | Retrieve all contacts of the user.    |
| Update Contact       | PUT             | `/contact/{id}`            | Update an existing contact by ID.     |
| Delete Contact       | DELETE          | `/contact/delete/{id}`     | Delete a contact by ID.               |


---

## Accessing the Authorization Service

### Sign-Up

To sign up, use the following endpoint. All critical user information will be hashed before storage to ensure security.

![Sign-up Process](https://github.com/user-attachments/assets/05e38e91-0cbf-433f-b63c-f072d3c779f6)

### Log-In

After signing up, the user can log in with their credentials. A successful login will return a token, which is required to access the Contact Service endpoints.

![Login Process](https://github.com/user-attachments/assets/711b208c-7e32-4bae-bd32-b1b0c2482cc3)

---

## Accessing the Contact Service

Once authenticated with a valid token, users can perform CRUD operations on their contact list.

![CRUD Operations](https://github.com/user-attachments/assets/02518937-d421-4d88-96df-295f6f8657d1)

If the request contains an invalid token, the system will respond with an unauthorized error.

![Unauthorized Request](https://github.com/user-attachments/assets/3af1993a-b111-41f2-8edd-3aa1a4505c95)

---

## Technologies Used
- **Spring Security** (JWT Authentication)
- **Spring Boot**
- **MONGO DB**

---

## Running the Application

For easier deployment make sure to have docker installed. 

To run this application, follow the steps below:
1. Clone the repository.
2. Run this command **docker-compose up --build**
