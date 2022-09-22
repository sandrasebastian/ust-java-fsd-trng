package defaultstaticmethods;
//A simple program to test interface default
//methods in java
interface TestInterface
{
	//abstract method
	public void square(int a);
	//default method
	default void show()
	{
		System.out.println("Default Method Executed");
	
	}
}
public class TestClass_1 implements TestInterface{
	
	
		//implementation of square abstract method
		public void square(int a) {
			System.out.println(a*a);
			}

	public static void main(String args[] )
	{
		TestClass_1 d=new TestClass_1();
		d.square(4);
		//default method excecuted
		d.show();
	
		}
	}


