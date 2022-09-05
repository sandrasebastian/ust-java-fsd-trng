package com.ust_day4;

public class Finalblock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int divideByZero=5/0;
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException=>"+e.getMessage());
     
	}
		finally {
			System.out.println("This is the finally block");
			
		}
			
		}

}
