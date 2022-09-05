package com.ust;

import java.util.Scanner;

public class Employee extends Engineer{

	
	Scanner sc=new Scanner(System.in); 
	int id;
    byte age;
    String name,department;
	
	void salary(int x) {
		int salary=x;
		System.out.println("Salary(int) in Employee:"+salary);
		
	}
	
	void salary(float x) {
		float salary=x;
		System.out.println("Salary(float) in Employee:"+salary);
		
	}
	
	void salary(double x) {
		double salary=x;
		System.out.println("Salary(double) in Employee:"+salary);
		super.salary(x);
		
	}
	
	void details() {
		System.out.println("Enter ID");
		 id=sc.nextInt();
		 System.out.println(id);
 	     System.out.println("Enter name");
 	     name=sc.next();
 	     System.out.println(name);
 	     System.out.println("Enter department");
 	     department=sc.next();
 	     System.out.println(department); 
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.details();
		
		System.out.println("calculate salary using object");
		e.salary(1000);
		
		System.out.println("\nmethod overloading");
		e.salary(2000);
		e.salary(3000.75f);
		
		System.out.println("\nmethod overriding");
		e.salary(4000.678d);
		
		
	}

}

class Engineer{
	int salary=7000;
	void salary(double x) {
		double salary=x;
		System.out.println("\nSalary(super) in Engineer class:"+salary);
		
	}
}
