package com.ust_interfaceday3;
//java code for this keyword
//to return the current class instance

public class Test_this 
{
	
      int a;
      int b;
//Default constructors
      Test_this()
  {
	  a=10;
	  b=20;

   }
//Method that returns current class instance
      Test_this get()
      {
    	  return this;
      }
      //Displaying value of variables a and b
      void display()
      {
    	  System.out.println("a="+a+" b="+b);
    	  
      }
      
      

	public static void main(String[] args) {
		Test_this object=new Test_this();
		object.get().display();
		

	}

}
