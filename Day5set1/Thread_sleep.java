package Day5set1;

public class Thread_sleep {
	public void run() {
		System.out.println("Doing heavy processing-START"+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
			//Get database connection,delete unused data from DB
			doDBProcessing();
			
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Doing heavy processing -END"+Thread.currentThread().getName());
	}
	private void doDBProcessing()throws InterruptedException{
		Thread.sleep(5000);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread_sleep s=new Thread_sleep();
		s.run();

	}

}
