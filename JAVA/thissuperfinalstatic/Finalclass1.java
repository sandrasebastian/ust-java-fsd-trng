package com.ust_thissuperfinalstatic;
class FinalClass  {
public void display() {
	System.out.println("This is a final method.");
}
}
public class Finalclass1 extends FinalClass {

    public void display() {
    	System.out.println("The method is overridden.");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finalclass1 obj=new Finalclass1();
     obj.display();
	}

}
