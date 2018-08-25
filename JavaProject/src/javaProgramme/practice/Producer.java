package javaProgramme.practice;

public class Producer extends Thread{
	
	StringBuffer sb;
	
	public Producer() {
		sb = new StringBuffer();
	}
	
	public void run()
	{
		synchronized (sb) {
			
			for(int i=1;i<=10;i++)
			{
				System.out.println("---Appending----");
				sb.append(i);
				try {
					Thread.sleep(900);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			sb.notify();
		}
	}

}
