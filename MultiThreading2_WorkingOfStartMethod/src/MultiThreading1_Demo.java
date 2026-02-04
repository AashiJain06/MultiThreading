
class MyThread extends Thread
{
	public void run()
	{
		int c =10;
		c = c/0;
		System.out.println("Inside run method");	}
}
public class MultiThreading1_Demo {
  public static void main(String[] args) {
	MyThread th = new MyThread();
	th.run();//Exception in thread "main" java.lang.ArithmeticException: / by zero
	th.start();//this will show exception as Exception in thread "Thread-0" java.lang.ArithmeticException: / by zero
}
}
