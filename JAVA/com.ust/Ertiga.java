package com.ust;

class Car{
	String model;
    String colors;
    int wheels;
    int seats;
    String geartype;
    
    void display() {
    	System.out.println("in car class");
    	
    }	
}

   class Ciaz extends Car {
	void display () {
		System.out.println("in a ciaz class");
	}
	void show() {
		System.out.println("in a show method");
	}
	
}
public class Ertiga extends Car {
	private char[] color;
	void display() {
		System.out.println("in a Ertiga class");
		super.display();
	}
	public static void main(String args[]) {
		Ciaz c=new Ciaz();
		
		c.display();
		c.show();
		Ertiga e= new Ertiga();
		e.display();
		System.out.println(e.color);
	}


}
