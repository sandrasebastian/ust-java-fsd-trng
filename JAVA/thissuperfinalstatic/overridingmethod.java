package com.ust_thissuperfinalstatic;
class Animal5{
public void display() 
{
	
	System.out.println("I am an animal");
}
}
class Dog extends Animal5{
	//overrriding method
	@Override
	public void display() {
		System.out.println("I am a dog");
		
	}
	public void printMessage() {
		display();
	}
	public void printType() {
		// TODO Auto-generated method stub
		
	}
	
}
public class overridingmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1=new Dog();
		dog1.printMessage();
		

	}

}
