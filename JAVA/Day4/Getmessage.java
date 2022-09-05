package com.ust_day4;

public class Getmessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int array[]=new int[10];
			array[10]=30/0;
				
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

	}

}
