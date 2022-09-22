package functionalinterface;
//Java program to demonstrate lambda expressions to
//implement a user defined functional interface.

@FunctionalInterface
interface Square{
	int calculate(int x);
}

public class Functionalinterface_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=5;
		//lambda expression to be defined the calculate method
		Square s=(int x)->x*x;
		
		//parameter passed and return type must be
		//same as defined in the prototype
		int ans=s.calculate(a);
		System.out.println(ans);
		

	}

}
