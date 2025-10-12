# Week 11 – Interfaces in Java

This week’s lab focuses on **Interfaces, Default and Static Methods, and Multiple Inheritance using Interfaces** in Java. The problems demonstrate how classes implement interfaces, resolve method ambiguity, and extend interfaces for practical applications.

## Topics Covered
- Creating and implementing interfaces  
- Static and default methods in interfaces  
- Multiple interface implementation and method conflict resolution  
- Interface inheritance  
- Practical applications (bank accounts, vehicles, printers, smart devices)

## 📂 Packages & Files

### Interface Problems
**problem01 (Account / Saving / Current)**  
- Create an interface `Account` with methods: `deposit()`, `withdraw()`, and `aboutBank()` (static).  
- Create classes `Saving` and `Current` implementing `Account`.  
- Call all methods of `Saving` and `Current` objects from `main`.

**problem02 (Account / Saving / Current with takeLoan)**  
- Add a **default method** `takeLoan()` to the `Account` interface.  
- Implement `takeLoan()` only in `Saving` class.  
- Call all methods including `takeLoan()` from `main`.

**problem03 (Bike / Scooty / BuySomething)**  
- Create interfaces `Bike` and `Scooty`, each with methods: `offer()` and `details()` (default).  
- Create a class `BuySomething` that implements both interfaces.  
- Resolve method ambiguity by overriding `details()` in `BuySomething` and calling both interface `details()` methods.  
- Call all methods of `BuySomething` from `main`.

---

### Optional / Advanced Problems
**problem04 (Printer / Scanner / MultiFunctionMachine)**  
- Create interfaces `Printer` and `Scanner` with methods: `connect()` and `details()` (default).  
- `MultiFunctionMachine` implements both interfaces.  
- Override `details()` to resolve ambiguity and call both interface `details()` methods.  
- Call all methods of `MultiFunctionMachine` from `main`.

**problem05 (Device / SmartDevice / SmartPhone)**  
- Create interface `Device` with method `powerOn()`.  
- Create interface `SmartDevice` that **extends Device** and adds method `connectWiFi()`.  
- Create class `SmartPhone` that implements `SmartDevice`.  
- Demonstrate calling both `powerOn()` and `connectWiFi()` using a `SmartPhone` object.

---
