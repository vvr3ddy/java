Constructor overloading in Java is a concept where a class can have more than one constructor, each with a different set of parameters. This allows objects of that class to be created with different initial states.

**In simple terms:** It's like having different types of doorways (constructors) into a building (an object); each doorway is designed for different purposes but ultimately leads you inside the building.

### Examples:

1. **Different number of parameters:**

```java
public class Rectangle {
    private int length;
    private int breadth;

    // Constructor with no parameters
    public Rectangle() {
        this.length = 0;
        this.breadth = 0;
    }

    // Constructor with two parameters
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}
```
Usage:
```java
Rectangle emptyRectangle = new Rectangle(); // creates a rectangle with length and breadth as 0
Rectangle rectangle = new Rectangle(5, 10); // creates a rectangle with length 5 and breadth 10
```

2. **Different types of parameters:**

```java
public class Time {
    private int hours;
    private int minutes;

    // Constructor to initialize time with hours and minutes
    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    // Constructor to initialize time with total minutes
    public Time(int m) {
        this.hours = m / 60;
        this.minutes = m % 60;
    }
}
```
Usage:
```java
Time dinnerTime = new Time(18, 30); // sets time to 18:30
Time wakeUpTime = new Time(450); // sets time to 7:30 (450 minutes from midnight)
```

3. **Using constructor overloading to set default values:**

```java
public class Member {
    private String name;
    private int age;
    private String email;

    // Constructor to set all attributes
    public Member(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Overloaded constructor with default age
    public Member(String name, String email) {
        this(name, 30, email); // Default age set to 30
    }
}
```
Usage:
```java
Member memberWithAllDetails = new Member("Alice", 25, "alice@example.com"); // creates a member with name, age, and email
Member memberWithDefaultAge = new Member("Bob", "bob@example.com"); // creates a member with name and email, age is default to 30
```

In these examples, each constructor provides a different way to set up a new object of the class, making it flexible to create an object with different initial information. This is particularly useful when you have multiple ways to define an object.
