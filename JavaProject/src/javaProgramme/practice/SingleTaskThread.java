package javaProgramme.practice;

public class SingleTaskThread extends Thread{
	
	public void run()
	{
		for(int i=1;i<=20;i++)
		{
			System.out.println("Single task Value = "+i);
			try {
				Thread.sleep(900);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	

}
