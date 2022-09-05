package com.ust_thissuperfinalstatic;
class Test_this1 {
int val_a;
int val_b;

Test_this1 ()
{
	val_a=10;
	val_b=20;
}
Test_this1 get()
{
	return this;
	
}
void display()
{
	System.out.println("val_a="+val_a+ " val_b="+val_b);
}
}
public class Mainval {

		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test_this1 object=new Test_this1();
		object.get().display();

	}

	private Test_this get() {
		// TODO Auto-generated method stub
		return null;
	}
	}
