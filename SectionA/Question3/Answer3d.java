class Animal {
  Animal() {
    System.out.println("Animal Created");
  }

  void eat() {
    System.out.println("Animal Eats");
  }

  void fly() {
    System.out.println("Animal Fly");
  }
}

/**
 * Answer3d
 */
public class Answer3d {
  public static void main(String[] args) {
    Animal a = new Animal();
    a.fly();
    a.eat();
    return;
  }
}
