import java.io.*;
import java.util.*;

public class Answer7a {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("input.txt"));
    String input;

    while ((input = br.readLine()) != null) {
      String[] eachline = input.split(",");
      List<Integer> track = new ArrayList<>();
      int sum = 0;
      for (String nums : eachline) {
        track.add(Integer.parseInt(nums.trim()));
        sum += Integer.parseInt(nums.trim());
      }
      System.out.println(sum);
    }

    br.close();
  }
}
