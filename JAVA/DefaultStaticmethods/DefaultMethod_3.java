package defaultstaticmethods;
interface Sayable_1{
	//default method
	default void say() {
		System.out.println("Hello, this is default method");
	}
	//Abstract method
	void sayMore(String msg); 
	//static method
	static void sayLouder(String msg) {
		System.out.println(msg);
		
	}
}
public class DefaultMethod_3 implements Sayable_1{
	public void sayMore(String msg) {
	//implementing abstract method
	System.out.println(msg);
	}
	public static void main(String[] args) {
    DefaultMethod_3 dm=new DefaultMethod_3();
    dm.say();
    dm.sayMore("Work is worship");//calling abstract method
    Sayable_1.sayLouder("Hellooooo.....");//calling static method

	}

}
