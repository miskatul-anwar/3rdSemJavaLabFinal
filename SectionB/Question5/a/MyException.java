import java.util.*;

public class MyException {
  public static void main(String[] args) {
    try {
      int a[] = new int[5];
      a[5] = 10;
      Integer.parseInt("abc");
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      sc.close();
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array index out of bounds!");
    } catch (NumberFormatException e) {
      System.out.println("Invalid number format!");
    }
  }
}
