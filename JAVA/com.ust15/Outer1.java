package com.ust15;

public class Outer1 {
class Inner1{
	void display() {
		System.out.println("in inner class");
	}
}
	public static void main(String[] args) {
	Inner1 i=new Outer1().new Inner1();
	i.display();

	}

}
