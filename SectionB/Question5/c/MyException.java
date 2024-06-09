package SectionB.Question5.c;

import java.util.Scanner;

class LowBatteryException extends Exception {
  public LowBatteryException(int chargeAmount) {
    super("Warning! Battery low. Charge amount is only " + chargeAmount + "%.");
  }
}

public class MyException {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 2; i++) {
      System.out.println("Enter current charge percent: ");
      int chargeAmount = sc.nextInt();
      try {
        if (chargeAmount <= 20) {
          throw new LowBatteryException(chargeAmount);
        } else {
          System.out.println("Enough charge in Battery");
        }
      } catch (LowBatteryException e) {
        System.out.println(e.getMessage());
      }
    }
    sc.close();
  }
}
