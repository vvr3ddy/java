**Object-Oriented Programming (OOP) in Java**

Object-Oriented Programming (OOP) is a programming paradigm based on the concept of "objects", which are instances of classes. These objects hold both data in the form of fields (often known as attributes or properties) and code in the form of procedures (often known as methods).

**Core OOP Concepts in Java**:

1. **Class**: A blueprint for creating objects. It defines a datatype by bundling data and methods that work on the data into one single unit.
   
2. **Object**: An instance of a class. When a class is defined, no memory is allocated until an object of that class is created.

3. **Inheritance**: A mechanism where one class can inherit the properties and methods of another class. The class that inherits is called a subclass, and the class that is inherited from is called a superclass.

4. **Polymorphism**: The ability of a variable, function, or object to take on multiple forms. In Java, this means that a subclass can define its own unique behavior and still share the same functionalities of its base class.

5. **Abstraction**: The concept of hiding the complex reality while exposing only the necessary parts. In Java, this is achieved using abstract classes and interfaces.

6. **Encapsulation**: The bundling of data with the methods that operate on that data. It restricts direct access to some of an object's components, which is a means of preventing accidental interference and misuse of the data.

**Code Snippets Demonstrating OOP Concepts**:

1. **Class and Object**:
   ```java
   public class Car {
       // Fields (attributes)
       private String color;
       private String model;
   
       // Constructor
       public Car(String color, String model) {
           this.color = color;
           this.model = model;
       }
   
       // Method
       public void displayDetails() {
           System.out.println("Car Model: " + model + " Color: " + color);
       }
   }
   
   // Main class to create objects of Car
   public class Main {
       public static void main(String[] args) {
           Car myCar = new Car("Red", "Mustang");
           myCar.displayDetails();
       }
   }
   ```

2. **Inheritance**:
   ```java
   public class Vehicle {
       private String brand;
   
       // Vehicle class methods and fields
   }
   
   public class Car extends Vehicle {
       private String model;
   
       // Car class methods and fields
   }
   ```

3. **Polymorphism**:
   ```java
   public class Animal {
       public void sound() {
           System.out.println("Some sound");
       }
   }
   
   public class Dog extends Animal {
       public void sound() {
           System.out.println("Woof");
       }
   }
   
   public class Main {
       public static void main(String[] args) {
           Animal myDog = new Dog();
           myDog.sound(); // Outputs "Woof", demonstrating polymorphism
       }
   }
   ```

4. **Abstraction**:
   ```java
   public abstract class Device {
       public abstract void turnOn();
       public void turnOff() {
           System.out.println("Device is off");
       }
   }
   
   public class Smartphone extends Device {
       public void turnOn() {
           System.out.println("Smartphone is on");
       }
   }
   ```

5. **Encapsulation**:
   ```java
   public class Account {
       private double balance;
   
       public void deposit(double amount) {
           if (amount > 0) {
               balance += amount;
           }
       }
   
       public double getBalance() {
           return balance;
       }
   }
   ```

In these examples, you can see how Java uses classes to create objects (`Car` and `Main`), extends classes to inherit properties and methods (`Car` extends `Vehicle`), overrides methods (`Dog` overrides `sound()`), abstracts details away (`Device` is abstract), and encapsulates data (`Account` hides `balance`). This is the essence of OOP in Java, which is all about creating reusable code through the use of classes and objects.
