package com.ust_polyinheritabstract;
abstract class Animal8{
	abstract void makeSound();
	
	public void eat() {
		System.out.println("I can eat");
		
	}
	}
		
			class Dog7 extends Animal{
				//provide implementation of abstract method
				public void makeSound() {
					System.out.println("Bark bark");
				}

				public void eat1() {
					// TODO Auto-generated method stub
					
				}
			}
public class Barkbark {

	public static void main(String[] args) {
		// create an object of Dog class
		Dog7 d1=new Dog7();
		
		d1.makeSound();
		d1.eat1();

	}

}
