public class SummationWithThreads {
  private static final int NUM_THREADS = 5;
  private static final int N = 100000;
  private static volatile long totalSum = 0; // Shared total sum

  public static void main(String[] args) {
    // Create and start threads
    Thread[] threads = new Thread[NUM_THREADS];
    for (int i = 0; i < NUM_THREADS; i++) {
      threads[i] = new WorkerThread(i * (N / NUM_THREADS) + 1, (i + 1) * (N / NUM_THREADS));
      threads[i].start();
    }

    // Wait for all threads to finish
    try {
      for (Thread thread : threads) {
        thread.join();
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    // Print the total summation
    System.out.println("Total Sum: " + totalSum);
  }

  // Worker thread class
  static class WorkerThread extends Thread {
    private final int start;
    private final int end;

    public WorkerThread(int start, int end) {
      this.start = start;
      this.end = end;
    }

    @Override
    public void run() {
      long localSum = 0;
      for (int i = start; i <= end; i++) {
        localSum += i;
      }
      // Add local sum to the total sum
      addToTotal(localSum);
    }
  }

  // Synchronized method to add local sum to total sum
  private synchronized static void addToTotal(long sum) {
    totalSum += sum;
  }
}
