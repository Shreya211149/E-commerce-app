# 🛒 Shopingo | Premium Ecommerce Web App

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
<img width="2151" height="1263" alt="Screenshot 2025-08-22 014004" src="https://github.com/user-attachments/assets/a831cb1c-ed4c-49a7-89f1-0dc847440047" />

<img width="2157" height="1245" alt="Screenshot 2025-08-22 012938" src="https://github.com/user-attachments/assets/7df6da38-6979-47b8-bc83-77b9d6077afb" />

<img width="2147" height="1279" alt="Screenshot 2025-08-22 013033" src="https://github.com/user-attachments/assets/fe8a9de9-3473-49a1-94d7-075e42f84fdc" />


## 👩‍💻 Author

Shreya Midya
Email: shreyamidya2003@.com
