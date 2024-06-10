
import java.util.ArrayList;
import java.util.Collections;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    try {
      // Step 1: Read the values from data.txt
      BufferedReader br = new BufferedReader(new FileReader("data.txt"));
      String line = br.readLine();
      br.close();

      // Parse the values from the file and add them to the first ArrayList
      String[] values = line.split(" ");
      ArrayList<Double> list = new ArrayList<>();
      for (String value : values) {
        list.add(Double.parseDouble(value));
      }

      // Step 2: Create a second ArrayList that contains the values in reversed order
      ArrayList<Double> reversedList = new ArrayList<>(list);
      Collections.reverse(reversedList);

      // Step 3: Write the contents of the reversed ArrayList to reversed.txt
      BufferedWriter bw = new BufferedWriter(new FileWriter("reversed.txt"));
      for (Double value : reversedList) {
        bw.write(value.toString() + " ");
      }
      bw.close();

      System.out.println("Reversed list written to reversed.txt");

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
