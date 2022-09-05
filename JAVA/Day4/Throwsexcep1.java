package com.ust_day4;

public class Throwsexcep1 {
	static void fun()throws IllegalAccessException
	{
		System.out.println("Inside fun().");
		throw new IllegalAccessException("demo");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			fun();
		

			}
		catch(IllegalAccessException e) {
			System.out.println("caught in main");
		}

	}

}
