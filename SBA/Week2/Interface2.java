package sbasinterface;

interface A1{
	void test();
}

interface B1{
	void test1();
}

interface C1 extends A1,B1{
		
 }

	
public class Interface2 implements C1 {
	
	public void test()
	{
		System.out.println("hiiii");
	}

	public void test1()
	{
		System.out.println("hiiiiabcd");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface2 w=new Interface2();
		w.test();
		w.test1();
		


	}

}
