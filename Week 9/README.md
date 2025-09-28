# Week 9 – Inheritance, Classes and Methods

This week’s lab introduces problems based on **Inheritance**, **Static Methods**, **Abstract Classes**, and **Method Overriding** in Java. Each problem is organized into its own package since they consist of multiple classes.

---

## Topics Covered

- Single and multilevel inheritance
- Method overriding and polymorphism
- Static methods and variables
- Abstract classes and abstract methods
- Encapsulation with constructors and methods
- Practical applications (banking, shapes, employees, appliances, math operations)

## 📂 Packages & Files  

### **Inheritance Problems**  
- **problem01 (Vehicle / Bus / Train)**  
  - Create a `Vehicle` class with method `cost()`  
  - Create `Bus` and `Train` classes with their own `display()` methods (inherit from `Vehicle`)  
  - Demonstrate calling `cost()` and `display()`  

- **problem02 (University / Faculty / Department)**  
  - `University` → data members: `name`, `ranking`  
  - `Faculty` (extends University) → data member: `name`, method: `Details()`  
  - `Department` (extends Faculty) → data members: `name`, `chairman`; methods: `Details()`, `Display()`  
  - `Display()` calls `Details()` of both `Faculty` and `Department`  
  - Create `Department` object and show details including University ranking  

---

### **Static Method Problems**  
- **problem03 (Account with Interest Calculation)**  
  - `Account` class with data members: `Id`, `Account_holder_name`, `Address`  
  - Methods: `deposit()`, `withdraw()`  
  - Two **static methods**: `calculateSimpleInterest()`, `calculateCompoundInterest()`  

- **problem09 (MathOperations)**  
  - `MathOperations` class with two **static methods**:  
    - `findGCD(int a, int b)` → Greatest Common Divisor  
    - `findLCM(int a, int b)` → Least Common Multiple  
  - Call methods directly **without creating an object**  

- **problem10 (Student with Static Variable)**  
  - `Student` class with data members: `rollNo`, `name`, `marks`  
  - **Static variable**: `schoolName`  
  - **Static method**: `changeSchoolName()` to update school name  
  - Demonstrate how the static variable is shared across objects  

---

### **Abstract Class Problems**  
- **problem04 (Abstract Account)**  
  - Abstract `Account` class with data members: `Id`, `Account_holder_name`, `Address`  
  - Abstract methods: `deposit()`, `withdraw()`  
  - Constructor included  

- **problem05 (Saving / Current Accounts)**  
  - `Saving` extends `Account` → data member: `Min_balance`; methods: `display()`, `deposit()`, `withdraw()`  
  - `Current` extends `Account` → data member: `Max_withdrawal_limit`; methods: `display()`, `deposit()`, `withdraw()`  
  - Constructors for both classes  
  - Create objects of both and demonstrate functionality  

- **problem06 (Shape / Rectangle / Circle)**  
  - `Shape` class with method `area()`  
  - `Rectangle` and `Circle` override `area()`  
  - Create objects and call their `area()`  

- **problem07 (Employee / Manager)**  
  - `Employee` class with data members: `name`, `salary`, method: `showDetails()`  
  - `Manager` extends Employee, adds `department`, overrides `showDetails()`  
  - Create `Manager` object and call `showDetails()`  

- **problem08 (Appliance / WashingMachine / Refrigerator)**  
  - Abstract class `Appliance` with data members: `brand`, `power`  
  - Abstract methods: `turnOn()`, `turnOff()`  
  - `WashingMachine` and `Refrigerator` implement their own versions  
  - Create objects and demonstrate methods  
