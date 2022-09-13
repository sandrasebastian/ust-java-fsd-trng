package com.ust_abstractinterfaces;
interface Polygon{
	void getArea(int length,int breadth);
	
}
//implement the polygon interface
class Rectangle implements Polygon{
	//implements abstract method
	public void getArea(int length,int breadth) {
		System.out.println("The area of the rectangle is "+(length*breadth));
	}
}
public class Polygon1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle r1=new Rectangle();
		r1.getArea(5,6);
		
	}

}
