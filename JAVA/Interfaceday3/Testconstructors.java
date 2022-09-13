package com.ust_interfaceday3;
 class Testconstructors
	{
		
		int a;
		int b;
		//Default constructor
		Testconstructors()
		{
			this(10,20);
			System.out.println("Inside default constructors\n");
		}
		//parameterized constructor
		Testconstructors(int a,int b)
		{
			this.a=a;
			this.b=b;
			System.out.println("Inside parmetrised constructor");
					
		
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testconstructors object=new Testconstructors();
	}

}
