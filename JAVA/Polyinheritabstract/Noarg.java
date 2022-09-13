package com.ust_polyinheritabstract;
class Animal5{
	//default or no-arg constructor
	Animal5(){
		System.out.println("I am an animal");
	}
	//parameterized constructor
	Animal5(String type){
	System.out.println("Type:"+type);
	}
	
}
class Dog5 extends Animal5{
	//default constructor
	Dog5(){
		//calling parametrised constructor of the super class
		super("Animal");
		System.out.println("I am a dog");
	
	
	}
	
}
public class Noarg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog5 dog1=new Dog5();

	}

}
