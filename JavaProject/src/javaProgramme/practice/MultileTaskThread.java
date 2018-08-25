package javaProgramme.practice;

public class MultileTaskThread implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=20;i++)
		{
			System.out.println("Multiple task Value = "+i);
			try {
				Thread.sleep(900);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
