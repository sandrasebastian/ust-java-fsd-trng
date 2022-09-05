package com.ust_thissuperfinalstatic;
class Animal3{
Animal3(){
	System.out.println("I am an animal");
}

Animal3(String type){

	System.out.println("Type:"+type);
	
}
}
class Dog4 extends Animal3{
Dog4(){
super("Animal");
System.out.println("I am a Dog");
}
}

public class Animalparametrised {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
  Dog4 dog1=new Dog4();
	}

}
