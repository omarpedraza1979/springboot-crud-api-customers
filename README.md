
# 📌 API REST CUSTOMERS:

API REST en **Spring Boot** que implementa operaciones CRUD sobre una lista de clientes en memoria.  
Proyecto didáctico para reforzar conceptos de desarrollo con Java y Spring Boot (sin persistencia en base de datos).


## 📌 Características
- ✅ CRUD completo (Create, Read, Update, Delete) sobre lista JSON en memoria.  
- ✅ API REST construida con Spring Boot.


---

## 🛠️ Tecnologías utilizadas
- **Java 17** → Lenguaje principal  
- **Spring Boot 3.3.7** → Framework  
- **Maven** → Gestión de dependencias  
- **Postman** → Pruebas de endpoints  

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



### 🔹 Pasos

# Clonar repositorio
git clone https://github.com/omarpedraza1979/springboot-crud-api-customers
cd springboot-crud-api-customers/cursoSprintBoot_v2

# Compilar y ejecutar
mvn spring-boot:run


#  El proyecto quedará disponible en:  

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
## 🧪 Postman
Este proyecto incluye una colección de Postman para probar los endpoints de la API. 
[SpringBootCustomers.postman_collection.json](./SpringBootCustomers.postman_collection.json)



## 👨‍💻 Autor
- **Omar Orlando Pedraza Garzón**
- [GitHub](https://github.com/omarpedraza1979)
---

