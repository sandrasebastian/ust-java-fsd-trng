package methodreference;

public class InstanceMethodReference_3 {
	public void printMsg() {
		System.out.println("Hello, this is instance method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t2=new Thread(new InstanceMethodReference_3()::printMsg);
		t2.start();

	}

}
