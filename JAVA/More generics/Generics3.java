package moregenerics;
class GenericsClass<T extends Number>{
	public void display() {
		System.out.println("This is a bounded type generics class.");
	}
}
public class Generics3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//craete object of Genericsclass
		GenericsClass<String>obj=new GenericsClass<>();
		

	}

}
