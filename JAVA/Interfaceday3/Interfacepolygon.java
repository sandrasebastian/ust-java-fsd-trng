package com.ust_interfaceday3;
interface Polygon{
	void getArea();
	//default method
	default void getSide() {
		System.out.println("I can get sides of a polygon.");
	}
	
}
//implements the interface 
class Rectangle implements Polygon{
	public void getArea() {
		int length=6;
		int breadth=5;
		int area=length*breadth;
		System.out.println("The area of the rectangle is"+area);
		
	}
	
	//overrides the getSides()
	public void getSide() {
		System.out.println("I have 4 sides");
		
	}

}
//implements the interface
	class Square implements Polygon{
		public void getArea() {
			int length=5;
			int area=length*length;
			System.out.println("The area of the square is"+area);
			
		}

		
	}
public class Interfacepolygon {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create an object rectangle
		Rectangle r1=new Rectangle();
		r1.getArea();
		r1.getSide();
		
	
		//create an object of square();
		Square s1=new Square();
		s1.getArea();
		s1.getSide();
		
		

	}

}
