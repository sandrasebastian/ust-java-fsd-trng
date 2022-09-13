package com.ust_interfaceday3;
interface A{
	void funcA();
}
interface B extends A{
	void funcB();
}
class C implements B{
	public void funcA() {
	System.out.println("This is a funcA");	
	}
	public void funcB() {
		System.out.println("This is a funcB");	
		}
}
public class DemoAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C obj=new C();
		obj.funcA();
		obj.funcB();
		

	}

}
