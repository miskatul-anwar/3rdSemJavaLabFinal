class A {
  public static final int var;
  public int par;
  static {
    var = 10;
    par = 5;
    System.out.println("Static Block in A");
  }

  void meth() {
    var = 15;
    System.out.println("Method in class A");
  }
}

class B extends A {
  @Override
  final void meth() {
    var += meth();
    System.out.println("Method in class B");
  }
}

final class C extends B {
  int star;

  @Override
  void meth() {
    System.out.println("Method in class C");
  }

  public static void main(String[] args) {
    B obj1 = new B();
    B obj2 = new B();
    obj1.meth();
    star = 100;
    System.out.println("par = " + obj1.par + ", var = " + obj2.var + ", star = " + star);
  }
}
