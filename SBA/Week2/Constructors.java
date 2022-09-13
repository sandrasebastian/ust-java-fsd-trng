package sbasinterface;

abstract class Demo{
	
	
	Demo(int a){
		System.out.println(a);
	}
}

public class Constructors extends Demo{
	
	Constructors(int x){
		super(x);
		System.out.println("In sub class");
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructors c = new Constructors(10);
		
	}

}
