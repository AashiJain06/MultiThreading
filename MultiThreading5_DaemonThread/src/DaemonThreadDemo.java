class MyThread extends Thread
{
	public void run()
	{
		for(int i =0;i<5;i++)
		{
			System.out.println(i+Thread.currentThread().getName());
		}
	}
}
public class DaemonThreadDemo {
	public static void main(String[] args) {
		MyThread th = new MyThread();
		th.setDaemon(true);
		System.out.println("Main Thread is executed");
		th.start();		
	}

}
