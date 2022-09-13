package com.ust_polyinheritabstract;
class Animal6{
	//method in super class
	public void eat() {
		System.out.println("I can eat");
	}
}
//Dog inherits Animal
class Dog3 extends Animal6{
	//overriding  the eat() method
	@Override
	public void eat() {
		//call method od superclass
		super.eat();
		System.out.println("I eat dog food");
	}
	//new method in subclass
	public void bark() {
		System.out.println("I can bark");
	}
}
public class Bark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog3 labrador=new Dog3();
		//call the eat()method
		labrador.eat();
		labrador.bark();
		

	}

}
