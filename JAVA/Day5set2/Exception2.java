package Day5set2;
class SuperException
{
	void display()
	{
		System.out.println("Display");
		
	}
}
public class Exception2 extends SuperException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperException s = new SuperException();
		Exception2 e= new Exception2();
		Exception2 s1=new Exception2();
		Exception2 e1= (Exception2) new SuperException();
		
	}

}
