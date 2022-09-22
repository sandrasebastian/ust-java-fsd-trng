package functionalinterface;

import static org.mockito.ArgumentMatchers.startsWith;

public class FunctionalInterface_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//lambda expression to create the object
		new Thread(()->{
			System.out.println("New thread created");
		}).start();
		}

	}


