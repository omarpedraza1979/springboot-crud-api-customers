
# 🚀 Spring Boot REST API - Customers CRUD

API REST construida con Spring Boot que implementa operaciones CRUD sobre una lista de clientes en memoria.
Este proyecto sirve como base para aprender desarrollo con Spring Boot y probar endpoints REST usando Postman.

## 📌 Características
- ✅ CRUD completo (Create, Read, Update, Delete) sobre lista JSON en memoria.  
- ✅ API REST construida con Spring Boot.

---

## 🛠️ Tecnologías utilizadas
- **Java 17** → Lenguaje principal  
- **Spring Boot 3.3.7** → Framework  
- **Maven** → Gestión de dependencias  
- **Postman** → Pruebas de endpoints
- **IntelliJ IDEA** → IDE Desarrollo

---

## 📂 Estructura del proyecto
```bash

src/
├── main/
│   ├── java/cursoSprintBoot_v2
│   │   ├── configuration
│   │   ├── controllers
│   │   └── domain
│   └── resources
└── test/java/cursoSprintBoot_v2

```
---

## ⚙️ Instalación y ejecución
### 🔹 Requisitos previos

- [Java 17+](https://adoptium.net/)
- [Maven](https://maven.apache.org/)


## 🔹 Pasos

1. Clonar repositorio
git clone https://github.com/omarpedraza1979/springboot-crud-api-customers

2. Compilar y ejecutar
 ..springboot-crud-api-productos\cursoSprintBoot_v2> mvn spring-boot:run   

3. La API quedará disponible en:  
http://localhost:8080

---

## 📌 Endpoints principales

| Método | Endpoint                              | Descripción                        |
|--------|---------------------------------------|------------------------------------|
| GET    | `/sistema/api/v1/clientes`            | Listar todos los clientes           |
| GET    | `/sistema/api/v1/clientes/{username}` | Buscar cliente por username         |
| POST   | `/sistema/api/v1/clientes`            | Crear cliente                       |
| PUT    | `/sistema/api/v1/clientes/{id}`       | Actualizar cliente existente        |
| PATCH  | `/sistema/api/v1/clientes/{id}`       | Actualizar parcialmente un cliente  |
| DELETE | `/sistema/api/v1/clientes/{id}`       | Eliminar cliente por ID             |


## 🧪 Ejemplo con CURL


1. Listar todos los clientes (GET)

curl http://localhost:8080/sistema/api/v1/clientes

2. Crear un nuevo cliente (POST)

curl -X POST http://localhost:8080/sistema/api/v1/clientes 
  -H "Content-Type: application/json" \
  -d '{
    "id": 1001,
    "name": "Juan Perez",
    "userName": "jperez",
    "password": "12345"
  }'
  
3. Eliminar un cliente por ID (DELETE)

curl -X DELETE http://localhost:8080/sistema/api/v1/clientes/1001


## 🧪 Postman
Este proyecto incluye una colección de Postman para probar los endpoints de la API. 
[SpringBootCustomers.postman_collection.json](./SpringBootCustomers.postman_collection.json)


## 📌 Ejemplos de Body JSON

### POST → Crear cliente
```json
{
  "id": 66666,
  "name": "GOMEZ",
  "userName": "Eparra",
  "password": "passsdadad"
}
```

### PUT → Actualizar cliente
```json
{
  "id": 66666,
  "name": "GOMEZ",
  "userName": "Eparra",
  "password": "newpassword123"
}
```

### PATCH → Actualizar parcialmente cliente
```json
{
  "name": "NuevoNombre",
  "userName": "Eparra"
}

```

---
## 🧪 Pruebas
```bash
mvn test
```
---

## 👨‍💻 Autor
- **Omar Orlando Pedraza Garzón**
- [GitHub](https://github.com/omarpedraza1979)
---


## 📜 Licencia
Este proyecto está bajo la licencia [MIT](LICENSE).  
Eres libre de usarlo, modificarlo y distribuirlo con fines personales o educativos.


