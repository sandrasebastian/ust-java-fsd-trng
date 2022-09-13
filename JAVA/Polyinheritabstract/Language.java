package com.ust_polyinheritabstract;
abstract class Language1{
	//method of abstract class
	public void display() {
		System.out.println("This is java programming");
	}



	}

public class Language extends Language1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Language obj=new Language();
		
		//access method of abstract class
		//using object of Main class
		obj.display();
	

	}

}
