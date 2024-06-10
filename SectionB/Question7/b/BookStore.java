import java.util.HashMap;

public class BookStore {
  public static void main(String[] args) {
    // Create a HashMap to store book IDs and titles
    HashMap<Integer, String> books = new HashMap<>();

    // Adding books to the HashMap
    books.put(101, "Structured Programming");
    books.put(102, "Algorithms");
    books.put(103, "Operating System");

    // Searching for a book by ID
    int searchID = 102;
    if (books.containsKey(searchID)) {
      System.out.println("Book ID: " + searchID + " - Title: " + books.get(searchID));
    } else {
      System.out.println("Book ID: " + searchID + " not found.");
    }

    // Adding another book
    books.put(104, "Data Structures");

    // Searching for another book by ID
    searchID = 104;
    if (books.containsKey(searchID)) {
      System.out.println("Book ID: " + searchID + " - Title: " + books.get(searchID));
    } else {
      System.out.println("Book ID: " + searchID + " not found.");
    }
  }
}
