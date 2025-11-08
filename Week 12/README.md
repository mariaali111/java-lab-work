# Week 12 – Exception Handling in JAVA

This week’s lab focuses on understanding and implementing different types of **exceptions** in Java. The exercises include handling unchecked exceptions, propagating checked exceptions, and creating user-defined exceptions for real-world scenarios.

---

## ✅ Topics Covered

- Unchecked Exceptions (`ArithmeticException`)
- Throwing exceptions inside loops
- Checked Exceptions using:
  - `try-catch`
  - `throws` keyword
- Creating and using **custom exceptions**
- Applying exceptions in practical programs (banking, age validation)
- Exception propagation across multiple functions

---

## 📁 Files

- **Problem01.java** →  
  Demonstrates an *Unchecked Exception*.  
  Calls a method that may throw an `ArithmeticException` (divide by zero or square root of negative number) inside a `for` loop. The exception is caught and an appropriate message is displayed.

- **Problem02.java** →  
  Demonstrates a *Checked Exception* occurring in the third function, but handled in the first calling function. Shows both exception-handling techniques:  
  - Using `try-catch`  
  - Using `throws` keyword

- **Problem03.java** →  
  Implements a simple online banking system.  
  If a user attempts to withdraw more than their balance, an `InsufficientFundsException` is thrown.

- **Problem04.java** →  
  Creates a custom `InvalidAgeException`.  
  The exception is thrown when a person's age is below 18 and handled at the appropriate location in the program.
