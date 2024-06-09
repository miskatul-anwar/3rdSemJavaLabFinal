package SectionB.Question5.c;

public class LowBatteryException extends Exception {
  public LowBatteryException(int chargeAmount) {
    super("Warning! Battery low. Charge amount is only " + chargeAmount + "%.");
  }
}
