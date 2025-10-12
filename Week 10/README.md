# Week 10 – Nested Classes and Polymorphism in Java

This week’s lab focuses on **Nested Classes, Static Polymorphism (Method Overloading), and Dynamic Polymorphism (Method Overriding)** in Java. Each problem is designed to reinforce understanding of object-oriented concepts and inheritance, demonstrating practical uses of inner classes and polymorphism.

## Topics Covered
- Member inner classes and static nested classes  
- Static and non-static methods in nested classes  
- Method overloading (Static Polymorphism)  
- Method overriding and runtime polymorphism (Dynamic Polymorphism)  
- Multi-level inheritance with overridden methods  
- Practical applications (person info, university hierarchy, employees, shapes, vehicles)

## 📂 Packages & Files

### Nested Class Problems
**problem01 (Person / Address / DateOfBirth)**  
- Create a `Person` class with data members: `name`, `phone`.  
- Create two **member inner classes**:  
  - `Address` → data members: `House_No`, `Street`, `City`, `State`; method: `displayAddr()`  
  - `DateOfBirth` → data members: `Day`, `Month`, `Year`; method: `displayDOB()`  
- `Person` class has method `display()` to show name, address, and date of birth of a `Person` object.  

**problem02 (Edible / Fruit / Vegetable)**  
- Create a class `Edible` with two **static nested classes**: `Fruit` and `Vegetable`.  
- `Fruit` class methods:  
  - `fruitDetails()` → static  
  - `fruitPackaging()` → non-static  
- `Vegetable` class methods:  
  - `vegetableDetails()` → static  
  - `vegetablePackaging()` → non-static  
- Call all four methods from `main` method.

---

### Static Polymorphism Problems (Method Overloading)
**problem03 (minMaxAdd)**  
- Create **three overloaded `minMaxAdd()` methods**:  
  1. For integers → calculate min, max, and addition  
  2. For real numbers → calculate min, max, and addition  
  3. For characters → calculate min, max, and addition  

---

### Dynamic Polymorphism Problems (Method Overriding)
**problem04 (ObjectOriented / JavaLanguage)**  
- `ObjectOriented` class methods: `abstraction()`, `polymorphism()`, `inheritance()`  
- `JavaLanguage` class inherits `ObjectOriented` and adds: `persistence()`, `interfaces()`  
- Create a `JavaLanguage` object to access both its own and parent’s methods.

**problem05 (ObjectOriented / C++)**  
- Create class `C++` inheriting `ObjectOriented` class with methods: `template()`, `friendFunction()`  
- Create a `C++` object to access both its own and parent’s methods.

**problem06 (University / Faculty / Department)**  
- `University` → data members: `name`, `ranking`  
- `Faculty` extends `University` → data member: `name`; method: `Details()`  
- `Department` extends `Faculty` → data members: `name`, `chairman`; methods: `Details()`, `Display()`  
- `Display()` calls `Details()` of both `Faculty` and `Department` and prints University ranking.  

---

### Optional/Additional Problems
**problem07 (Employee / Salary / JoiningDate)**  
- `Employee` class → data members: `empName`, `empId`  
- Two **member inner classes**:  
  - `Salary` → `basic`, `hra`, `pf`; method: `displaySalary()`  
  - `JoiningDate` → `day`, `month`, `year`; method: `displayJoiningDate()`  
- `displayEmployee()` method prints employee name, ID, salary, and joining date.

**problem08 (Shape – Method Overloading)**  
- Overloaded `area()` methods:  
  - `area(int side)` → square  
  - `area(int length, int breadth)` → rectangle  
  - `area(double radius)` → circle  

**problem09 (Vehicle / Bike / Car – Method Overriding)**  
- `Vehicle` class with method `run()`  
- `Bike` and `Car` subclasses override `run()`  
- Use a `Vehicle` reference in `main` to call `run()` for `Bike` and `Car` objects.  

---
