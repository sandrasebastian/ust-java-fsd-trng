package com.ust_thissuperfinalstatic;

public class This_constructor {
	int val1;
	int val2;
	
	This_constructor()
	{
		this(10,20);
		System.out.println("Default constructor\n");
	}
	
	//parametrized constructors
	This_constructor(int val1, int val2)
	{
		this.val1=val1;
		this.val2=val2;
		System.out.println("Parametrized constructor\n");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This_constructor object=new This_constructor();
			
		}

	}


