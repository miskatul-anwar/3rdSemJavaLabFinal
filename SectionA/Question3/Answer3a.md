Here's how you can write the `Fruit` class to achieve the expected output for the `FruitShop` class:

### Fruit Class

```java
public class Fruit {
  // Instance variables
  private String name;
  private double weight;
  private double pricePerKG;

  // Constructor
  public Fruit(String name, double weight, double pricePerKG) {
    this.name = name;
    this.weight = weight;
    this.pricePerKG = pricePerKG;
  }

  // Method to reduce the price per kg by a specified amount
  public void reducePricePerKG(double amount) {
    if (pricePerKG - amount > 0) {
      pricePerKG -= amount;
    } else {
      System.out.println("Reduction amount is too high. Price per kg cannot be negative.");
    }
  }

  // Method to increase the price per kg by a specified amount
  public void increasePricePerKG(double amount) {
    pricePerKG += amount;
  }

  // Method to calculate the total price
  public double calculateTotalPrice() {
    return weight * pricePerKG;
  }

  // Method to print the fruit details
  public void printDetails() {
    System.out.println("Name: " + name);
    System.out.println("Weight: " + weight + "kg");
    System.out.println("Price per kg: " + pricePerKG);
    System.out.println("Total price: " + calculateTotalPrice());
  }
}
```

### FruitShop Class

```java
public class FruitShop {
  public static void main(String[] args) {
    // Creating Fruit objects
    Fruit fruit1 = new Fruit("Apple", 3.5, 100);
    Fruit fruit2 = new Fruit("Mango", 5, 90);

    // Adjusting prices
    fruit1.reducePricePerKG(10);
    fruit2.increasePricePerKG(20);

    // Printing fruit details
    System.out.println("Fruit Details:");
    fruit1.printDetails();
    System.out.println("Fruit Details:");
    fruit2.printDetails();
  }
}
```

### Explanation

1. **Constructor**: The `Fruit` class has a constructor that initializes the name, weight, and price per kg of the fruit.
2. **Price Adjustment Methods**: The methods `reducePricePerKG` and `increasePricePerKG` adjust the price per kg by a specified amount.
3. **Total Price Calculation**: The method `calculateTotalPrice` computes the total price based on the weight and price per kg.
4. **Printing Details**: The method `printDetails` prints the name, weight, price per kg, and total price of the fruit.

### Expected Output

```
Fruit Details:
Name: Apple
Weight: 3.5kg
Price per kg: 90.0
Total price: 315.0
Fruit Details:
Name: Mango
Weight: 5.0kg
Price per kg: 110.0
Total price: 550.0
```

This setup ensures that the `FruitShop` class produces the expected output when run. The `Fruit` class is designed to encapsulate all necessary details and behaviors of a fruit, including price adjustments and detailed printing.
