The provided code segment in the `Sample` class demonstrates method overloading, a feature in Java where multiple methods in the same class have the same name but different parameters (number or type of parameters). Method overloading allows a class to have more than one method with the same name, increasing code readability and reusability.

Here's the `Display` class that supports the given code:

```java
class Display {
  // Method to display a single character
  public void disp(char c) {
    System.out.println("Character: " + c);
  }

  // Overloaded method to display a character and an integer
  public void disp(char c, int num) {
    System.out.println("Character: " + c + ", Integer: " + num);
  }

  // Overloaded method to display a character, an integer, and a double
  public void disp(char c, int num, double d) {
    System.out.println("Character: " + c + ", Integer: " + num + ", Double: " + d);
  }
}

class Sample {
  public static void main(String args[]) {
    Display obj = new Display();
    obj.disp('a');
    obj.disp('a', 10);
    obj.disp('a', 10, 5.5);
  }
}
```

### Java Feature/Technique: Method Overloading

Method overloading is the technique used here. It allows a class to have multiple methods with the same name but different parameter lists (different type, number, or both).

### Benefits of Method Overloading

1. **Improves Readability**: Methods with the same name performing similar actions with different parameters can make the code easier to understand. Users of the class can recognize that the methods are related and provide a consistent interface.

2. **Enhances Code Reusability**: Overloaded methods allow code to be reused with different types or numbers of inputs, reducing the need to write new methods for each variation.

3. **Convenient for Developers**: It provides a way to call similar methods with different sets of parameters, making it easier for developers to work with different data types without remembering multiple method names.

4. **Supports Polymorphism**: Method overloading is a type of polymorphism (specifically, compile-time polymorphism), which enhances the flexibility and scalability of the code.

### Expected Output

When the `main` method in the `Sample` class is executed, the following output is produced:

```
Character: a
Character: a, Integer: 10
Character: a, Integer: 10, Double: 5.5
```

This demonstrates how the `Display` class handles different method calls with varying parameters, showcasing the effectiveness of method overloading.
