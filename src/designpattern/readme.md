# Design Patterns in Java

This document provides a structured overview of the **23 Gang of Four (GoF) Design Patterns**, categorized into Creational, Structural, and Behavioral patterns with real-world examples and interview-focused notes.

---

# 1. Creational Design Patterns (5)

These patterns deal with **object creation mechanisms**.

| Pattern             | Purpose |
|---------------------|--------|
| ## Singleton        | Ensure only one instance of a class exists. |
| ## Factory Method   | Create objects without exposing instantiation logic. |
| ## Abstract Factory | Create families of related objects. |
| ## Builder          | Construct complex objects step by step. |
| Prototype           | Create objects by cloning existing ones. |

### Examples

- Singleton → Logger, Configuration
- Factory Method → VehicleFactory
- Abstract Factory → IndiaFactory / USAFactory
- Builder → EmployeeBuilder
- Prototype → Cloning objects (Game character, Document)

---

# 2. Structural Design Patterns (7)

These patterns deal with **class and object composition**.

| Pattern      | Purpose |
|--------------|--------|
| Adapter      | Convert incompatible interfaces. |
| Bridge       | Separate abstraction from implementation. |
| Composite    | Treat individual and group objects uniformly. |
 ## Decorator | Add behavior dynamically. |
| Facade       | Simplify complex subsystem. |
| Flyweight    | Share objects to reduce memory usage. |
| ## Proxy     | Control access to objects. |

### Examples

- Adapter → Power plug adapter
- Bridge → Remote control for different TVs
- Composite → File system (files & folders)
- Decorator → Coffee with extra milk/sugar
- Facade → One API calling multiple services
- Flyweight → Character sharing in text editors
- Proxy → Lazy loading / security proxy

---

# 3. Behavioral Design Patterns (11)

These patterns focus on **object communication and responsibility**.

| Pattern                 | Purpose |
|-------------------------|--------|
| Chain of Responsibility | Pass request through chain of handlers. |
| Command                 | Encapsulate requests as objects. |
| Interpreter             | Define grammar and interpretation logic. |
| Iterator                | Traverse collections. |
| Mediator                | Centralize communication between objects. |
| Memento                 | Capture and restore object state. |
| ## Observer             | Notify dependent objects of changes. |
| State                   | Change behavior based on internal state. |
| ## Strategy             | Select algorithm at runtime. |
| Template Method         | Define algorithm skeleton with customizable steps. |
| Visitor                 | Add new operations without modifying structure. |

### Examples

- Observer → YouTube subscriptions, notifications
- Strategy → Payment methods (UPI, Card, PayPal)
- Command → Undo/Redo system
- Iterator → Java Collection iteration
- State → Traffic light system
- Mediator → Air traffic control
- Template Method → Beverage preparation process
- Chain of Responsibility → Logging frameworks
- Memento → Undo in editors
- Visitor → Compiler AST operations
- Interpreter → SQL parsing

---

# quick recall
Create objects → Factory, Builder
One instance → Singleton
Change behavior → Strategy
Add behavior → Decorator
Control access → Proxy
Notify changes → Observer
Hide complexity → Facade
