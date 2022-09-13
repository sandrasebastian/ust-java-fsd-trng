package sbasinterface;
interface A{
	void test();
}
interface B{
	void test1();
}
 class C implements A,B{
	public void test()
	{
		System.out.println("hiiii");
	}
	
	public void test1()
	{
		System.out.println("hiiiiabcd");
	}
 }
public class Interface1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C w=new C();
		w.test();
		w.test1();
		

	}

}
