package com.ust;

import java.util.Scanner;

public class Input {

	private static final String String = null;

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//getting float input
		System.out.print("Enter float:");
		float myFloat=input.nextFloat();
		System.out.println("Float entered="+myFloat);
		
		
		//getting double input
		System.out.print("Enter double:");
		double myDouble=input.nextDouble();
		System.out.println("Double entered="+myDouble);
		//getting double input
		System.out.print("Enter text:");
		String myString=input.next();
		System.out.println("Text entered="+String);
		
	}

}
