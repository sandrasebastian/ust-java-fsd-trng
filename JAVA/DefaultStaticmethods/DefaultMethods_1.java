package defaultstaticmethods;
interface Sayable{
	//Default method
	default void say() {
		System.out.println("Hello,this is default method");
		
	}
	//Abstract method 
	void sayMore(String msg);
}
public class DefaultMethods_1 implements Sayable{

		public void sayMore(String msg) {
			//implementing abstract method
			System.out.println(msg);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        DefaultMethods_1 dm=new DefaultMethods_1();
        dm.say();//calling abstract method
        dm.sayMore("Work is worship");//calling abstract method
        
	}

}
