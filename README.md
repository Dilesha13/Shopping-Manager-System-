## Shopping Manager System

## Project Description

The project involves developing a program to manage an online shopping system with both a console-based manager interface and a graphical user interface (GUI) for customers.

## Features

### Console Menu (Manager Interface)
- Add a new product to the system (either Electronics or Clothing).
- Delete a product from the system using the product ID.
- Print the list of products in the system.
- Save the list of products to a file and load it upon application startup.

### Graphical User Interface (Customer Interface)
- Select product types from a drop-down menu (All, Electronics, Clothing).
- Display the list of products with their details in a table.
- Highlight items with less than 3 available in red.
- Add products to a shopping cart.
- Display the shopping cart with the final price and applicable discounts.

## Project Structure

```plaintext
project/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   ├── westminster/
│   │   │   │   │   ├── models/
│   │   │   │   │   │   ├── Product.java
│   │   │   │   │   │   ├── Electronics.java
│   │   │   │   │   │   ├── Clothing.java
│   │   │   │   │   │   ├── User.java
│   │   │   │   │   │   ├── ShoppingCart.java
│   │   │   │   │   ├── WestminsterShoppingManager.java
│   │   │   │   │   ├── ShoppingManager.java
│   │   └── resources/
│   │       ├── products.txt
├── test/
│   ├── java/
│   │   ├── com/
│   │   │   ├── westminster/
│   │   │   │   ├── models/
│   │   │   │   │   ├── ProductTest.java
│   │   │   │   │   ├── ElectronicsTest.java
│   │   │   │   │   ├── ClothingTest.java
│   │   │   │   │   ├── UserTest.java
│   │   │   │   │   ├── ShoppingCartTest.java
│   │   │   │   ├── WestminsterShoppingManagerTest.java
│   │   │   ├── TestRunner.java
├── UML/
│   ├── use_case_diagram.png
│   ├── class_diagram.png
├── README.md
├── report.pdf
├── demo_video.mp4
└── .gitignore
