class Counter {
  int count = 0;

  public void increment() {

    // race Condition
    count++;
  }
}

public class RaceConditionDemo {
  public static void main(String[] args) throws InterruptedException {

    Counter c = new Counter();
    Thread t1 = new Thread(() -> {
      for (int i = 1; i <= 10000; i++)
        c.increment();
    });
    Thread t2 = new Thread(() -> {
      for (int i = 1; i <= 10000; i++)
        c.increment();
    });

    t1.start();
    t2.start();

    t1.join();
    t2.join();

    System.out.println(c.count);
    System.out.println("Main Thread Ends");
  }

}
