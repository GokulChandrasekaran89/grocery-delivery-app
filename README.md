# Grocery-delivery-app
## 📌 Project Overview

This project is a **Full Stack Microservices-based Grocery Delivery Application** that allows users to browse products, place orders, and track deliveries in real time. The system ensures **live inventory synchronization** to avoid stock mismatches.

---

## 🚀 Key Features

* 👤 User Registration & Login (JWT Authentication)
* 🛍️ Browse Grocery Products
* 🛒 Add to Cart & Place Orders
* 📦 Real-Time Inventory Sync
* 🚚 Order Tracking & Delivery Assignment
* 🔔 Real-Time Notifications (WebSocket)
* 🧑‍💼 Admin Product Management

---

## 🏗️ Architecture

This project follows **Microservices Architecture**:

```
Frontend (React)
       |
API Gateway
       |
-----------------------------------------
|        |        |        |            |
User   Product   Order   Delivery   Notification
Service Service  Service  Service     Service
```

---

## 🖥️ Tech Stack

### Frontend

* React.js
* Axios
* React Router

### Backend

* Spring Boot
* Spring Security (JWT)
* Spring Data JPA

### Database

* MySQL

### Real-Time

* WebSocket / STOMP

### DevOps

* Docker
* GitHub

---

## 📂 Project Structure

```
grocery-delivery-app/
│
├── frontend/                 # React App
│
├── backend/
│   ├── user-service/
│   ├── product-service/
│   ├── order-service/
│   ├── delivery-service/
│   ├── notification-service/
│   └── api-gateway/
│
├── docker-compose.yml
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

For each microservice:

```
cd backend/product-service
mvn spring-boot:run
```

Repeat for all services.

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

### 🔹 5. Run with Docker (Optional)

```
docker-compose up --build
```

---

## 🔄 API Endpoints (Sample)

### Product Service

* `GET /products` → Get all products
* `POST /products` → Add product

### Order Service

* `POST /orders` → Place order

---

## 🔁 Inventory Sync Logic

When an order is placed:

```
stock = stock - ordered_quantity
```

Ensures real-time stock updates.

---

## 📸 Screenshots (Add Later)

* Home Page
* Product Listing
* Cart Page
* Order Tracking

---

## 📈 Future Enhancements

* 📱 Mobile App (React Native)
* 🤖 AI-based Recommendations
* 📍 Live Delivery Tracking (Maps)
* ☁️ Cloud Deployment (AWS)

---

## 👨‍💻 Author

**Gokul C**

---
---

