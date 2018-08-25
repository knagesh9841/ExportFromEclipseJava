package javaProgramme.practice;

public class ThreadSynchronization implements Runnable{

	int available = 1;
	int wanted;
	
	public ThreadSynchronization(int wanted) {
	
		this.wanted = wanted;
	}
	@Override
	public void run() {
		
		synchronized (this) {
			
			System.out.println("Available berth is "+available);
			
			if(available>=wanted)
			{
				System.out.println("Berth reserved for "+Thread.currentThread().getName());
				try {
					Thread.sleep(900);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				available = available - wanted;
				
			}else
			{
				System.out.println("Sorry No berth is available");
			}
			
		}
	}

}
