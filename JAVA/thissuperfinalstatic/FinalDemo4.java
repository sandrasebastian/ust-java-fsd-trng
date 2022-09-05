package com.ust_thissuperfinalstatic;

public class FinalDemo4 {
public void display() {
	System.out.println("This is a final method.");
}
static class Main extends FinalDemo4{
	public final void display() {
		System.out.println("This is a final method is overridden.");
	}
public static void main(String[]args) {
		// TODO Auto-generated method stub
   Main obj=new Main();
   obj.display();
	}

}
}

