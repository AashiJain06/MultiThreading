class MyThread extends Thread
{
	public void run()
	{
//		try {
//			this.join();//here in this scenerio the program will stuck in the infinite loop
//		} catch (InterruptedException e) {
//			System.out.println(e);
//		}
		for(int i =0;i<5;i++)
		{
			System.out.println(i+Thread.currentThread().getName());
		}
     }
}
public class JoinDemo {
   public static void main(String[] args) throws InterruptedException{
	MyThread th = new MyThread();
	th.start();
	th.join();
	for(int i =0;i<5;i++)
	{
		System.out.println(i + Thread.currentThread().getName());
	}
}
}
