public class Animal {
  Animal() {
    System.out.println("Animal Created");
  }

  void eat() {
    System.out.println("Animal eats");
  }

  void fly() {
    System.out.println("Animal Fly");
  }
}

public class Bird extends Animal {
  Bird() {
    System.out.println("Bird Created");
  }

  @Override
  void fly() {
    System.out.println("Birds Fly");
  }

  public static void main(String[] args) {
    Animal a = new Bird();
    a.fly();
    a.eat();
  }
}
