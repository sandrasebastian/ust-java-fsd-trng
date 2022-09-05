package com.ust_day4;

public class Arithmeticexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//code that generate exception
			int divideByZero=5/0;
			System.out.println("Rest of code in try block");
			
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException=>"+e.getMessage());	
		}
	}

}
