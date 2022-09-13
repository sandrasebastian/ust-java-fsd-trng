package com.ust_polyinheritabstract;
class Animal{
	public void displayInfo() {
		System.out.println("I am an animal.");
		
	}
}
class Dog extends Animal{
	public void displayInfo() {
		super.displayInfo();
		
	System.out.println("I am a dog.");
}
}
public class Animalsuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1= new Dog();
		d1.displayInfo();

	}

}
