package com.ust_interfaceday3;
     //Java program to illustrate the concept
     //of Autoboxing and Unboxing
     //importing required classes
import java.io.*;
//Main class



public class Main_driver {
	//Main driver method
	
	public static void main(String[] args) {
		// creating an Integer Object
		//with custom value say it be 10
		Integer i=new Integer(10);
		
		//unboxing the object
		int i1=i;
		
		//print statements
		System.out.println("Value of i:"+i);
		System.out.println("Value of i1:"+i1);
		
		//Autoboxing of character
		Character X='a';
		
		//Auto-unboxing of character
		char ch=X;
		
		//print statements
		System.out.println("Value of ch:"+ch);
		System.out.println("Value of X:"+X);
		
		
		

	}

}
