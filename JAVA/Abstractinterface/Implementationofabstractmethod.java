package com.ust_abstractinterfaces;
abstract class Animal{
	abstract void makeSound();
public void eat() {
	System.out.println("I can eat.");
}
}
class Dog extends Animal{
	public void makeSound() {
		System.out.println("Bark bark");
	}
}
public class Implementationofabstractmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Dog d1=new Dog();
    d1.makeSound();
    d1.eat();
	}

}
