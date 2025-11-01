# Enhanced-Student-Management-System

## Objective

Enhance the Student Management System using:
- **Exception Handling** (`try-catch-finally`, custom exceptions)
- **Multithreading** (`Thread`, `Runnable`)
- **Wrapper Classes** (`Integer`, `Double`, autoboxing)

## Class Overview

| Class | Description |
|-------|--------------|
| `Student` | Uses wrapper classes and calculates grade |
| `StudentManager` | Adds and views students with validation |
| `Loader` | Implements `Runnable` for simulating loading |
| `StudentNotFoundException` | Custom checked exception |
| `Main` | Driver class for execution |

## Features

- Input validation using exceptions  
- Multithreading for loading animation  
- Wrapper class usage with autoboxing  
- Custom exception (`StudentNotFoundException`)  
- Try-catch-finally demonstration  

## 🧾 Sample Output

Enter Roll No (Integer): 102
Enter Name: Karan
Enter Email: karan@mail.com

Enter Course: BCA
Enter Marks: 77.5
Loading.....
Student added successfully!
Add operation completed.

Student Info:
Roll No: 102
Name: Karan
Email: karan@mail.com

Course: BCA
Marks: 77.5
Grade: B

View operation completed.
Program execution completed.

## Packages Used

- model → Student class
- service → StudentManager class
- threads → Loader class (Runnable)
- exceptions → Custom exception class

## Learning Outcomes

- Exception handling using try, catch, finally
- Thread creation and synchronization
- Wrapper class and autoboxing usage
- Clean, modular code with packages

## Author

Name - Kartikeya Drall

Roll.No - 2401720014

B.Sc (H) Computer Science

Java Programming Lab Assignment - 3
