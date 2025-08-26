# 📌 API REST CUSTOMERS

REST API built with **Spring Boot** that implements CRUD operations on an in-memory list of customers.  
This project was created for educational purposes to strengthen development concepts with Java and Spring Boot (without database persistence).

---

## 📌 Features
- ✅ Full CRUD (Create, Read, Update, Delete) on an in-memory JSON list.  
- ✅ REST API built with Spring Boot.  

---

## 🛠️ Technologies Used
![Java](https://img.shields.io/badge/Java-17-blue)
![Spring Boot](https://img.shields.io/badge/SpringBoot-3.3.7-brightgreen)
![Maven](https://img.shields.io/badge/Maven-Dependency%20Manager-orange)
![Postman](https://img.shields.io/badge/Postman-API%20Testing-red)

- **Java 17** → Main programming language  
- **Spring Boot 3.3.7** → Framework  
- **Maven** → Dependency management  
- **Postman** → Endpoint testing  

---

## 📂 Project Structure
```bash
src/
├── main/
│   ├── java/cursoSprintBoot_v2
│   │   ├── configuration
│   │   ├── controllers
│   │   └── domain
│   └── resources
└── test/java/cursoSprintBoot_v2
⚙️ Installation and Execution
🔹 Prerequisites
Java 17+

Maven

🔹 Steps
bash
Copiar
Editar
# Clone repository
git clone https://github.com/omarpedraza1979/springboot-crud-api-customers
cd springboot-crud-api-customers/cursoSprintBoot_v2

# Compile and run
mvn spring-boot:run
👉 The project will be available at:
http://localhost:8080

📌 Main Endpoints
Method	Endpoint	Description
GET	/sistema/api/v1/clientes	Retrieve all customers
GET	/sistema/api/v1/clientes/{username}	Find customer by username
POST	/sistema/api/v1/clientes	Create new customer
PUT	/sistema/api/v1/clientes/{id}	Update existing customer
PATCH	/sistema/api/v1/clientes/{id}	Partially update a customer
DELETE	/sistema/api/v1/clientes/{id}	Delete customer by ID

📌 JSON Body Examples
POST → Create customer
json
Copiar
Editar
{
  "id": 66666,
  "name": "GOMEZ",
  "userName": "Eparra",
  "password": "passsdadad"
}
PUT → Update customer
json
Copiar
Editar
{
  "id": 66666,
  "name": "GOMEZ",
  "userName": "Eparra",
  "password": "newpassword123"
}
PATCH → Partially update customer
json
Copiar
Editar
{
  "name": "NuevoNombre",
  "userName": "Eparra"
}
🧪 Tests
bash
Copiar
Editar
mvn test
🧪 Postman
This project includes a Postman collection to test the API endpoints.
👉 SpringBootCustomers.postman_collection.json

👨‍💻 Author
Omar Orlando Pedraza Garzón

GitHub

yaml
Copiar
Editar

---
