package com.ust_interfaceday3;
//create an inteface
interface Language{
	void getName(String name);
}
//class implementing interface
class ProgrammingLanguage implements Language{
	
	//implementation of abstract method
	public void getName(String name) {
		System.out.println("Programming Language:"+name);
	}
}

public class Maininterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProgrammingLanguage language=new ProgrammingLanguage();
		language.getName("Java");

	}

}
