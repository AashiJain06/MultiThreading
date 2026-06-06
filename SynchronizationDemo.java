class Counter {
  static int count = 0;

  // Synchronized Method
  // public synchronized void increment(){
  public void increment() {
    synchronized (this) {
      count++;
    }
  }
}

public class SynchronizationDemo {
  public static void main(String[] args) throws InterruptedException {

    Counter c1 = new Counter();
    Counter c2 = new Counter();
    Thread t1 = new Thread(() -> {
      for (int i = 1; i <= 10000; i++)
        c1.increment();
    });
    Thread t2 = new Thread(() -> {
      for (int i = 1; i <= 10000; i++)
        c2.increment();
    });

    t1.start();
    t2.start();

    t1.join();
    t2.join();

    System.out.println(Counter.count);
    System.out.println("Main Thread Ends");
  }

}
