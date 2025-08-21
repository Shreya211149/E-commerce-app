# 🛒 Shopify | Premium Ecommerce Web App

A full-stack **Ecommerce application** built with **Spring Boot**, **MySQL**, **HTML/CSS/Bootstrap**, and **JavaScript**. Users can browse products, manage a cart, and place orders.  

---

## ✨ Features
- User registration and login  
- Browse products by category (Clothing, Electronics, Trending)  
- Add/update/remove products in cart (persisted in localStorage)  
- Place orders with order summary  
- Admin can add/delete products  
- Responsive UI with Bootstrap  
- Hero banner with carousel  

---

## 🛠️ Tech Stack
- **Backend:** Java, Spring Boot, Spring Data JPA  
- **Frontend:** HTML5, CSS3, Bootstrap 5, JavaScript  
- **Database:** MySQL  
- **APIs:** RESTful endpoints  

---

## 🔗 API Endpoints

**User**
- `POST /users/register` – Register  
- `POST /users/login` – Login  
- `GET /users` – Fetch all users  

**Product**
- `GET /products` – Fetch all products  
- `GET /products/{id}` – Fetch product by ID  
- `POST /products` – Add product  
- `DELETE /products/{id}` – Delete product  

**Order**
- `POST /orders/place/{userId}` – Place order  
- `GET /orders/all-orders` – Fetch all orders  
- `GET /orders/user/{userId}` – Fetch orders by user  

---

## 📸 Screenshots

## 👩‍💻 Author

Shreya Midya
Email: shreyamidya2003@.com
