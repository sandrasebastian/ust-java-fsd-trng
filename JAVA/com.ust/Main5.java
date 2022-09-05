package com.ust;

public class Main5 {

	public static void main(String[] args) {
		//declared double type variables
		Double n1=-1.0,n2=4.5,n3=-5.3,largest;
		//chaecks if n1 is greater than or equal to n2
		if(n1>=n2) {
			if (n1>=n3) {
			largest=n1;
			
		}
		else {
			largest=n3;
		}
		
	}else {
		//if...else statement inside else block
		//check if n2 is greater than or equal to n3
		if(n2>=n3) {
			largest=n1;
		
		}
		else {
			
			if(n2>=n3) {
			largest=n2;			
		}
			else {
				largest=n3;
			}
}
System.out.println("Largest Number:"+largest);
	}}}