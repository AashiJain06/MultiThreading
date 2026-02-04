class MyThread extends Thread
{
	public void run()
	{
		Thread th = Thread.currentThread();
		String name = th.getName();
		for(int i =0;i<5;i++)
		{
			System.out.println(i+name);
			try
			{
				Thread.sleep(250);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
}
public class ThreadDemo {
	public static void main(String[] args) {
		MyThread th1 = new MyThread();
		th1.start();
		Thread th = Thread.currentThread();
		String name = th.getName();
		for(int i =0;i<5;i++)
		{
			System.out.println(i+name);
			try
			{
				Thread.sleep(750);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}

}
