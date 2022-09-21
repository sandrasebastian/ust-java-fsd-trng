package methodreference;
interface Sayable{
	void say();
	
}
public class MethodReference_3 {
	public static void saySomething() {
		System.out.println("Hello,this is static method.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Referring static method
		Sayable sayable=MethodReference_3::saySomething;
		//calling interface method
		sayable.say();

	}

}
