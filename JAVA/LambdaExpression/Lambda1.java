package lambdaexpression;
//this is a functional interface
@FunctionalInterface
interface MyInterface{
	//abstract method
	double getPiValue();
}
public class Lambda1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare a reference to MyInterface
		MyInterface ref;
		//lMDA EXPRESSION
		ref=()->3.1415;
		System.out.println("Value of Pi="+ref.getPiValue());

	}

}
