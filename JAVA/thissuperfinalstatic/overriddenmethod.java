package com.ust_thissuperfinalstatic;
class Animal1{
	public void display() {
		System.out.println("I am an animal");
		
	}

}
class Dog2 extends Animal1{
	@Override
	public void display() {
		System.out.println("I am a dog");
	}
	public void printMessage() {
		display();
		super.display();
		
	}
}
public class overriddenmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog2 dog1=new Dog2();
		dog1.printMessage();

	}

}
