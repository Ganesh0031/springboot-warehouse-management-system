# Warehouse Management System (WMS)

A scalable and enterprise-inspired **Warehouse Management System (WMS)** built using **Spring Boot**, **Spring Data JPA**, **Hibernate**, and **MySQL**. This project demonstrates real-world backend development practices including inventory management, purchase order processing, sales order management, stock transfers, supplier management, and secure RESTful API design.

## 🚀 Project Overview

The Warehouse Management System is designed to simplify warehouse operations by managing products, suppliers, inventory, purchase orders, sales orders, goods receipts, and stock transfers.

The project follows a layered architecture with Entity → DTO → Repository → Service → Controller and is being developed using industry-standard backend development practices.

---

## ✨ Features

### User Management
- User Registration
- Role-based Users (Admin, Manager, Staff)
- Authentication (JWT - Planned)

### Warehouse Management
- Create Warehouse
- Update Warehouse
- View Warehouses
- Manage Warehouse Inventory

### Product Management
- Add Products
- Update Products
- Delete Products
- Product Categories
- Product Pricing

### Supplier Management
- Supplier Registration
- Supplier Details Management

### Inventory Management
- Maintain Stock
- Available Quantity
- Reserved Quantity
- Inventory Tracking

### Purchase Order Management
- Create Purchase Orders
- Purchase Order Items
- Purchase Order Status Tracking

### Goods Receipt (GRN)
- Receive Purchased Goods
- Partial & Complete Goods Receipt
- Update Inventory

### Sales Order Management
- Create Sales Orders
- Sales Order Items
- Sales Order Status Tracking

### Stock Transfer
- Transfer Products Between Warehouses
- Track Transfer Status

### Inventory Transactions
- Purchase Transactions
- Sales Transactions
- Transfer In
- Transfer Out
- Inventory Audit Trail

---

# 🏗 Architecture

```
Controller
     │
     ▼
Service
     │
     ▼
Repository
     │
     ▼
Database
```

The project follows a clean layered architecture for better maintainability and scalability.

---

# 🛠 Tech Stack

## Backend

- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- Spring Validation
- Lombok
- Maven

## Database

- MySQL

## API Testing

- Postman

## Build Tool

- Maven

---

# 📂 Project Structure

```
src
└── main
    ├── controller
    ├── service
    ├── repository
    ├── dto
    ├── entity
    ├── enums
    ├── exception
    ├── config
    └── util
```

---

# 📊 Entity Relationship

Current domain model includes:

- User
- Warehouse
- Product
- Inventory
- Supplier
- PurchaseOrder
- PurchaseOrderItem
- GoodsReceipt
- GoodsReceiptItem
- SalesOrder
- SalesOrderItem
- StockTransfer
- StockTransferItem
- InventoryTransaction

---

# 📦 Core Modules

### Product Module

- Product CRUD
- Product Categories
- Pricing

### Inventory Module

- Warehouse-wise Inventory
- Reserved Quantity
- Available Quantity

### Supplier Module

- Supplier Management

### Purchase Module

- Purchase Orders
- Purchase Order Items
- Goods Receipt

### Sales Module

- Sales Orders
- Sales Order Items

### Stock Transfer Module

- Warehouse-to-Warehouse Transfers

### Inventory Audit Module

Tracks every stock movement including:

- Purchase
- Sale
- Transfer In
- Transfer Out
- Damage
- Return
- Inventory Adjustment

---

# 🔄 Inventory Flow

```
Supplier
    │
    ▼
Purchase Order
    │
    ▼
Goods Receipt (GRN)
    │
    ▼
Inventory

Inventory
    │
    ├────────► Sales Order
    │
    └────────► Stock Transfer

Every movement creates an Inventory Transaction.
```

---

# 📌 Business Rules

- Product belongs to one category.
- One supplier can have multiple purchase orders.
- One purchase order contains multiple purchase order items.
- One sales order contains multiple sales order items.
- Products are maintained warehouse-wise through Inventory.
- Every inventory movement is recorded in InventoryTransaction.
- Available Quantity = Total Quantity − Reserved Quantity.

---

# 🚧 Planned Features

- JWT Authentication
- Spring Security
- Role-Based Authorization
- Swagger/OpenAPI Documentation
- Global Exception Handling
- Docker Support
- Unit Testing (JUnit & Mockito)
- Inventory Reports
- Dashboard Analytics
- Low Stock Alerts
- Email Notifications

---

# 📈 Future Improvements

- Barcode / QR Code Support
- Multi-Warehouse Dashboard
- Redis Caching
- Audit Logs
- File Upload
- Export Reports (Excel/PDF)
- Docker Deployment
- CI/CD Pipeline
- Cloud Deployment (AWS)

---

# 🎯 Learning Outcomes

Through this project, I gained hands-on experience in:

- Spring Boot REST API Development
- Spring Data JPA & Hibernate
- Database Design & Entity Relationships
- One-to-One, One-to-Many & Many-to-One Mapping
- DTO Pattern
- Layered Architecture
- Inventory Management Logic
- Warehouse Operations
- Enterprise Project Design
- Clean Code Practices

---

# 👨‍💻 Author

**Ganesh Ingle**

Java Backend Developer

**Skills**

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- REST APIs
- Git
- Maven

---

## ⭐ Project Status

🚧 **Currently Under Active Development**

This project is continuously being enhanced by implementing enterprise-level warehouse management features and best backend development practices.
