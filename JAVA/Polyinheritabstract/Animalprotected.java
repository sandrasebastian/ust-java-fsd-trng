package com.ust_polyinheritabstract;
class Animal1{
	protected void displayInfo() {
		System.out.println("I am an animal");
	}
}
class Dog1 extends Animal{
	public void displayInfo() {
		System.out.println("I am a dog");
		
	}
}
public class Animalprotected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1=new Dog();
				d1.displayInfo();

	}

}
