package Day5set1;
import java.lang.*;

/**
 * The type Join demo.
 */
public class JoinDemo implements Runnable{
	/**
	 * Run.
	 */
	@Override
	public void run() {
		
		Thread t=Thread.currentThread();
		System.out.println("Cutrrent thread:"+t.getName());
		
		//checks if current thread is live
		System.out.println("Is Alive?"+t.isAlive());
		
		
	}

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 * @throws Exception the exception
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Thread t=new Thread(new JoinDemo());
		t.start();
		//waits for 1000ms this thread to die.
		t.join(1000);
		System.out.println("\n joining after 1000"+"milliseconds:\n");
		System.out.println("Current thread:"+t.getName());
		
		//checks if this thread is alive
		System.out.println("Is alive?"+t.isAlive());

	}

	

}
