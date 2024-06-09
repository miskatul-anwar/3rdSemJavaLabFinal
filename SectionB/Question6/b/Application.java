package SectionB.Question6.b;

class MyThread extends Thread {

  MyThread() {
    System.out.println("MyThread");
  }

  @Override
  public void run() {
    for (int i = 0; i < 4; i++) {
      System.out.println("running");
      try {
        Thread.sleep(1000); // Corrected from sleep(1000)
      } catch (InterruptedException e) {
        e.printStackTrace(); // Added exception handling
      }
    }
  }

  public void run(String s) {
    System.out.println(s + " is Running again");
  }
}

public class Application {
  public static void main(String[] args) {
    Thread t = new MyThread();

    ((MyThread) t).run("MyThread"); // Calling overloaded run method

    t.start(); // Starting the thread
  }
}
