# 📚 Library Management System (Java)

A simple **console-based Library Management System** built using **Core Java (OOP + Collections)**.  
This project allows users to **add, issue, return, and view books** in a library.

---

## 🚀 Features
- Add new books to the library 📖  
- View all available books 👀  
- Issue a book to a user ✅  
- Return a book 🔄
- View all issued books 👀  
- Prevents issuing already issued books 🚫  
- Menu-driven console interface 🖥️  

---

## 🛠️ Tech Stack
- **Language:** Java
- **IDE:** IntelliJ IDEA
- **Concepts Used:**  
  - Object-Oriented Programming (OOP)  
  - Collections (`ArrayList`)  
  - Exception Handling  
  - Scanner for user input  

---

## 📂 Project Structure
```
LibraryManagementSystem/
├── src/
│   ├── Book.java        # Book class
│   ├── User.java        # User class
│   ├── Library.java     # Library management
│   └── Main.java        # Main menu-driven program
├── README.md            # Project documentation
```

## 🖼️ Sample Output
```
--- Library Menu ---
1. Add Book
2. Show Available Books
3. Issue Book
4. Return Book
5. Show All Issued Books
6. Exit
Choose option: 1
Enter book title: Java Basics
Enter author: Java
Java Basics added to the library.

--- Library Menu ---
Choose option: 1
Enter book title: Java Advanced
Enter author: Java
Java Advanced added to the library.

--- Library Menu ---
Choose option: 2
Available Books:
Java Basics by Java [Available]
Java advanced by Java [Available]

--- Library Menu ---
Choose option: 3
Enter student name: Vishwas
Enter book title to issue: Java Basics
Java Basics issued to Vishwas

--- Library Menu ---
Choose option: 5
Issued Books:
Java Basics by Java [Issued to: Vishwas]

--- Library Menu ---
Choose option: 4
Enter student name: Vishwas
Enter book title to return: Java Basics
Vishwas returned Java Basics

--- Library Menu ---
Choose option: 5
Issued Books:
No books are currently issued.

--- Library Menu ---
Choose option: 6
Exiting...

```
