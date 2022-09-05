package com.ust_thissuperfinalstatic;



class Animal{
	Animal(){
		System.out.println("I am an animal");
	}
}

class Dog1 extends Animal{
	Dog1(){
		super();
		System.out.println("I am a dog");
		
	}
}
public class Animaldefault{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Dog1 dog1=new Dog1();
	}

}
