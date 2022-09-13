package com.ust_polyinheritabstract;
class Animal3{
//overriden method
public void display() {
	System.out.println("I am an Animal");
	
}
}
class Dog2 extends Animal3{
	//overriden method
	@Override
	public void display() {
		System.out.println("I am a Dog");
		

}
	public void printMessage() { 
	
		//this calls overriding method
	    display();
		//this calls overriden method
		super.display();
	
	}		
	}
public class Animaloverriden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog2 dog1=new Dog2();
		dog1.printMessage();
		

	}

}
