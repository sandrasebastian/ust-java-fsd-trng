package com.ust15;

public class MethodLocal {
	void display() {
		int x=5;
		class MethodInner{
			void display1(){
				System.out.println("In method local");
			
				
			}
		}
		MethodInner i=new MethodInner();
		
	}//method ends
	public static void main(String args[]) {
		MethodLocal m=new MethodLocal();
		m.display();
		System.out.println("calling outer class");
		
	}


}
