package com.ust;
 class A {}

class B extends A{}

public class InstanceofDemo {

	public static void main(String[] args) {
		
	    B objofclassB= new B();
	    System.out.println("objofclassB is an instance of B:"+(objofclassB instanceof B));
	    System.out.println("objofclassB is an instance of parent class A:"+(objofclassB instanceof A));
		}

}


