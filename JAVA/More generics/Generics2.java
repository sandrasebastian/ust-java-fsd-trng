package moregenerics;


public class Generics2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			//initialize the class with integer data
				DemoClass demo=new DemoClass();
				//generics method working with String
				demo.<String>genericsMethod("Java Programming");
				
				//generics method working with integer
				demo.<Integer>genericsMethod(25);
			}}
			class DemoClass{
				
				//create a geenrics method
				public<T>void genericsMethod(T data){
					System.out.println("Generics Method:");
					System.out.println("Data Passed:"+data);
					
				}
	}


