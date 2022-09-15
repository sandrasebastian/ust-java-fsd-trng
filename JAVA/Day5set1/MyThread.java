package Day5set1;

public class MyThread extends Thread {
	public MyThread(String name) {
		super(name);	
	}
	
public void run() {
	System.out.println("MyThread-START"+Thread.currentThread().getName());
	try {
		Thread.sleep(1000);
		//Get database connection,delete unused data from DB
		doDBProcessing();
		
	}
	catch(InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println("MyThread-END"+Thread.currentThread().getName());
}
private void  doDBProcessing() throws InterruptedException
{
	Thread.sleep(1000);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t=new MyThread("sandra");
		
		t.start();

	}

}
