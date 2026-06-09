
public class DeadLockDemo {
  static Object lock1 = new Object();
  static Object lock2 = new Object();

  public static void main(String[] args) {
    Thread t1 = new Thread(() -> {
      synchronized (lock1) {
        System.out.println("Thread-1 accquire lock1");
        try {
          Thread.sleep(100);
        } catch (Exception e) {

        }
        synchronized (lock2) {
          System.out.println("Thread-1 accquired lock2");
        }
      }
    });
    Thread t2 = new Thread(() -> {
      synchronized (lock2) {
        System.out.println("Thread-2 accquire lock2");
        try {
          Thread.sleep(100);
        } catch (Exception e) {

        }
        synchronized (lock1) {
          System.out.println("Thread-2 accquired lock1");
        }
      }
    });
    t1.start();
    t2.start();
  }

}