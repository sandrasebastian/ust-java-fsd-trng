package com.ust_thissuperfinalstatic;
class Animal2{
	protected String type="animal";
	
	}

class Dog3 extends Animal2{
	public String type="mammal";
	
	public void printType() {
		System.out.println("I am a "+type);
		System.out.println("I am an "+super.type);
	}}
public class Superclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Dog3 dog1=new Dog3();
      dog1.printType();
      
	

}}
