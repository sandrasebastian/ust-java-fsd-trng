package com.ust_day3;

public class ThrowExcep {
	static void fun()
	{
		try
		{
			throw new NullPointerException("demo");
			
		}
		catch(NullPointerException e)
		{
			System.out.println("Caught inside fun().");
			throw e;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			fun();
		}
		catch(NullPointerException e)
		{
			System.out.print("Caught in main");
		}

	}

}
