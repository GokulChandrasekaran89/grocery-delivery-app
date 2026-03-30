# Grocery-delivery-app
## 📌 Project Overview

This project is a **Full Stack Microservices-based Grocery Delivery Application** built using **React.js and Spring Boot**.

It allows users to browse products, place orders, and ensures **real-time inventory synchronization** to prevent stock mismatches.

---

## 🚀 Key Features

* 👤 User-friendly interface for browsing products
* 🛍️ Add and manage grocery products
* 🛒 Place orders easily
* 📦 Real-Time Inventory Sync
* ⚡ Fast REST API communication between services
* ❗ Global Exception Handling

---

## 🏗️ Architecture

This project follows a **Microservices Architecture**:

```
Frontend 
       |
       |
Backend 
```

* **Product Service** → Manages products & stock
* **Order Service** → Handles order placement & reduces stock

---

## 🖥️ Tech Stack

### Frontend

* React.js
* Axios
* React Router

### Backend

* Spring Boot
* Spring Data JPA
* REST APIs

### Database

* MySQL

### Tools

* Git & GitHub

---

## 📂 Project Structure

```
grocery-delivery-app/
│
├── backend/
│   ├── product-service/
│   └── order-service/
│
├── frontend/
│
└── README.md
```

---

## ⚙️ Installation & Setup

### 🔹 1. Clone Repository

```
git clone https://github.com/your-username/grocery-delivery-app.git
cd grocery-delivery-app
```

---

### 🔹 2. Backend Setup

---
cd backend
mvn spring-boot:run
---

### 🔹 3. Frontend Setup

```
cd frontend
npm install
npm start
```

---

### 🔹 4. Database Setup

Create MySQL database:

```
CREATE DATABASE grocery_db;
```

Update `application.properties`:

```
spring.datasource.url=jdbc:mysql://localhost:3306/grocery_db
spring.datasource.username=root
spring.datasource.password=yourpassword
```

---

## 🔄 API Endpoints

### 📦 Product Service 

* `GET /products` → Get all products
* `POST /products` → Add product
* `POST /products/reduce/{id}/{qty}` → Reduce stock

---

### 🧾 Order Service 

* `POST /orders` → Place order

---

## 🔁 Inventory Sync Logic

When an order is placed:

```
stock = stock - ordered_quantity
```

✔ Ensures real-time stock updates
✔ Prevents overselling

---

## 📸 Screenshots

(Add your UI screenshots here)

* Home Page
* Add Product Page
* Order Page

---

## 📈 Future Enhancements

* 🔐 JWT Authentication
* 🛒 Cart System
* 🔔 Real-Time Notifications (WebSocket)
* 🚚 Delivery Tracking
* ☁️ Cloud Deployment (AWS / Render)

---

## 👨‍💻 Author

**Gokul C**


If you like this project, give it a ⭐ on GitHub!
