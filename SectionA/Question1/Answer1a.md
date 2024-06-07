Object-Oriented Programming (OOP) is a programming paradigm based on the concept of "objects" that can contain data and methods. The three important features of OOP are encapsulation, inheritance, and polymorphism. Let's explain each feature and demonstrate how they can be utilized in the context of the provided code segment.

### 1. Encapsulation

Encapsulation is the mechanism of restricting access to some of the object's components and protecting the object's state from unauthorized access and modification. It is achieved using access modifiers like private, protected, and public.

In the provided code, the `radius` field is accessible directly, which is not an ideal practice. Let's encapsulate the `radius` field by making it private and providing public getter and setter methods.

```java
package SectionA;

public class Answer1a {
  private double radius;

  public Answer1a(double r) {
    radius = r;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    if (radius > 0) {
      this.radius = radius;
    }
  }

  public double area() {
    return 3.14 * radius * radius;
  }

  public static void main(String[] args) {
    Answer1a circle = new Answer1a(5.0);
    System.out.println("Area: " + circle.area());
    circle.setRadius(10.0);
    System.out.println("New Area: " + circle.area());
  }
}
```

### 2. Inheritance

Inheritance is the mechanism by which one class can inherit fields and methods from another class. This allows for code reuse and the creation of a hierarchical relationship between classes.

Let's create a `Circle` class that inherits from a more general `Shape` class.

```java
package SectionA;

class Shape {
  public double area() {
    return 0.0;
  }
}

public class Circle extends Shape {
  private double radius;

  public Circle(double r) {
    radius = r;
  }

  @Override
  public double area() {
    return 3.14 * radius * radius;
  }

  public static void main(String[] args) {
    Circle circle = new Circle(5.0);
    System.out.println("Area: " + circle.area());
  }
}
```

### 3. Polymorphism

Polymorphism allows objects to be treated as instances of their parent class rather than their actual class. This enables one interface to be used for a general class of actions.

In the context of our classes, polymorphism allows us to treat a `Circle` object as a `Shape` object. This can be demonstrated by modifying the `main` method to use a `Shape` reference.

```java
package SectionA;

class Shape {
  public double area() {
    return 0.0;
  }
}

public class Circle extends Shape {
  private double radius;

  public Circle(double r) {
    radius = r;
  }

  @Override
  public double area() {
    return 3.14 * radius * radius;
  }

  public static void main(String[] args) {
    Shape shape = new Circle(5.0); // Polymorphism
    System.out.println("Area: " + shape.area());
  }
}
```

In this example:

- **Encapsulation**: The `radius` field is private, and access to it is controlled through public getter and setter methods.
- **Inheritance**: The `Circle` class inherits from the `Shape` class, allowing the reuse of code.
- **Polymorphism**: A `Circle` object is referenced by a `Shape` variable, demonstrating how objects can be treated as instances of their parent class.

These three features—encapsulation, inheritance, and polymorphism—are fundamental to OOP and allow for the creation of flexible, modular, and reusable code.
