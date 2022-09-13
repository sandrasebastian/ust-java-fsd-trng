package moregenerics;

public class Generics1 {

	public static void main(String[] args) {
		// initialize generic class
		//with integer data
		GenericClass<Integer>intObj=new GenericClass<>(5);
		System.out.println("Generic Class return:"+intObj.getData());
		//initialize generic class
		//with string data
		GenericClass<String>stringObj=new GenericClass<>("Java programming");
		System.out.println("Generic class returns:"+stringObj.getData());
	}
}
		//create a generic class
	class GenericClass<T>{
		//variableb of T type 
		private T data;
		public GenericClass(T data) {
		this.data=data;
				
		}
		//method that return T type variable
		public T getData() {
			return this.data;
		}
			
		
	}
		
		
		
		

	

