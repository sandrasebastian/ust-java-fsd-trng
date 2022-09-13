package com.ust_abstractinterfaces;
abstract class MotorBike1{
	abstract void brake();
}
class SportsBike1 extends MotorBike1{
	//implementation of abstract method
	public void brake() {
		System.out.println("SportsBike Brake");
	}
}
class MountainBike1 extends MotorBike1{
	//implementation of abstract method
	public void brake() {
		System.out.println("MountainBike Brake");
	
}
}
public class Mainbike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MountainBike1 m1=new MountainBike1();
	    m1.brake();
	    SportsBike1 s1=new SportsBike1();
	    s1.brake();
	}
}



