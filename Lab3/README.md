# TYPES OF VARIABLES, INHERITANCE AND ABSTRACT CLASS
### 1. TYPES OF VARIABLES
There are three types of variables in Java:

* Local Variable
A variable declared inside the body of the method is called local variable. You can use this variable only within that method and the other methods in the class aren't even aware that the variable exists.A local variable cannot be defined with "static" keyword.

- Instance Variable
A variable declared inside the class but outside the body of the method, is called instance variable. It is not declared as static.It is called instance variable because its value is instance specific and is not shared among instances.

- Static variable
A variable which is declared as static is called static variable. It cannot be local. You can create a single copy of static variable and share among all the instances of the class. Memory allocation for static variable happens only once when the class is loaded in the memory.

### 2. Inheritance
Inheritance is a mechanism in which one class acquires the property of another class.
For example, a child inherits the traits of his/her parents. With inheritance, we can reuse the fields and methods of the existing class.
Types of inheritance in java
On the basis of class, there can be three types of inheritance in java : single, multilevel and hierarchical.
* Single Inheritance
When a class inherits another class, it is known as a single inheritance. In the example given below, Dog class inherits the Animal class, so there is the single inheritance.
- Multilevel Inheritance Example
When there is a chain of inheritance, it is known as multilevel inheritance. As you can see in the example given below, BabyDog class inherits the Dog class which again inherits the Animal class, so there is a multilevel inheritance.
- Hierarchical Inheritance Example
When two or more classes inherits a single class, it is known as hierarchical inheritance. In the example given below, Dog and Cat classes inherits the Animal class, so there is hierarchical inheritance.

### 3. Abstraction in Java
Data Abstraction is the property by virtue of which only the essential details are displayed to the user.The trivial or the non-essentials units are not displayed to the user. Ex: A car is viewed as a car rather than its individual components.

Data Abstraction may also be defined as the process of identifying only the required characteristics of an object ignoring the irrelevant details.The properties and behaviors of an object differentiate it from other objects of similar type and also help in classifying/grouping the objects
