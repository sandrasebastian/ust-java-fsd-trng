package com.ust_polyinheritabstract;
class Animal4{
	protected String type="animal";
}
class Dog4 extends Animal4{
	public String type="mammal";
	public void printType() {
		System.out.println("I am a "+type);
		System.out.println("I am an "+super.type);
		
		
	}
}
public class Protectedstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog4 dog1=new Dog4();
		dog1.printType();
		
		

	}

}
