package com.ust_polyinheritabstract;
class Animal7{
	protected String name;
	protected void display() {
		System.out.println("I am an animal");
	}
}
class Dog6 extends Animal7{
	public String name;

	public void getInfo()
{
		System.out.println("My name is "+name);
		
}

		
	
}
public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create an object of the subclass
		Dog6 labrador=new Dog6();
		//access protected field and method
		//using the object of class
		labrador.name="Rocky";
		labrador.display();
		labrador.getInfo();

	}

}
