package javaProgramme.practice;

public class Consumer extends Thread{
	
	Producer prod;
	
	public Consumer(Producer prod) {
		// TODO Auto-generated constructor stub
		this.prod = prod;
	}
	
	public void run()
	{
		synchronized (prod.sb) {
			
			try {
				prod.sb.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Value = "+prod.sb);
		}
	}

}
