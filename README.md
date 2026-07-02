# ☕ Advanced Java Object-Oriented Programming (OOP) Architecture

A production-ready reference architecture showcasing the strict implementation of core Object-Oriented Programming (OOP) design patterns and clean code principles in Java.

---

## 🏗️ Repository Modules & Class Hierarchy

The codebase is engineered into decoupled semantic systems to demonstrate modular structural patterns:

### 💼 1. Employee Salary Management System (`/EmployeeSalarySystem`)
Demonstrates robust **Inheritance**, **Method Overriding**, and polymorphic execution layers across an enterprise workforce template.

*   `Employee.java` — **The Abstract Base Engine:** Establishes protected data attributes (`name`, `id`, `baseSalary`) using strict encapsulation standards.
*   `RegularEmployee.java` — **Permanent Node:** Extends the base engine to factor in stable monthly corporate benefits and structured packages.
*   `Contractor.java` — **Hourly Logic Wrapper:** Overrides compensation workflows to compute dynamic hourly payouts based on operational logs.
*   `Managers.java` — **High-Priority Node:** Inherits base behaviors while appending specialized bonus calculation engines and tier modifications.
*   `EmployeeSalarySystem.java` — **System Driver:** Controls the collection arrays and acts as the entry execution point.

### 🎓 2. Student Performance Tracking System (`/StudentPerformanceTracking`)
Demonstrates object association, database-like tracking arrays, and behavioral dependency flows.

*   `Student.java` — **Identity Blueprint:** Maps individual scholastic metrics, enrollment tracking, and GPA properties.
*   `Course.java` — **Academic Node:** Handles individual course structures, unique catalog coding, and credit distribution weights.
*   `StudentPerformanceTracking.java` — **Analytics Core:** Runs iterative performance scans across course objects to output aggregate progress analytics.

---

## ⚡ Realized OOP Pillars & Patterns

| OOP Pillar | Technical Application in Codebase |
| :--- | :--- |
| 🛡️ **Encapsulation** | All core fields use `private` / `protected` levels combined with robust validation checkpoints inside structural getters/setters. |
| 🌿 **Inheritance** | Maximum logic reuse achieved by scaling specialized employee tiers (`Contractor`, `RegularEmployee`) directly from a uniform root profile. |
| 🔮 **Polymorphism** | Dynamic late-binding runtime compensation processing accomplished via structural `@Override` declarations on salary computation methods. |
| 🧩 **Abstraction** | Architectural blueprints decoupling low-level data entities from high-level tracking modules. |

---

## 🛠️ Compilation & Local Validation

To compile the codebase using the native console system:

```bash
# Compile the Employee Module
javac EmployeeSalarySystem/*.java

# Execute the Employee Module Driver
java EmployeeSalarySystem.EmployeeSalarySystem

# Compile the Student Tracking Module
javac StudentPerformanceTracking/*.java

# Execute the Student Module Driver
java StudentPerformanceTracking.StudentPerformanceTracking
