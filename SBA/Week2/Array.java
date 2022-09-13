package SBA2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Employees{
	int employeeid;
	String name;
	Scanner sc=new Scanner(System.in);
	
	void getDetails() {
		System.out.println("Enter id");
		employeeid=sc.nextInt();
		System.out.print("Enter name:");
		name=sc.next();
		
	}
	void display() {
		System.out.println("id:"+employeeid);
		System.out.println("Name:"+name);
		
	}
}
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int count=0;
		//Employee e[]=new Employee[20];
		List<Employees> e=new ArrayList<>();
		System.out.println("enter no of employees:");
		int n=sc.nextInt();
		Employees e1[]=new Employees[n+1];
		for(int i=1;i<=n;i++) {
			e1[i]=new Employees();
			e1[i].getDetails();
			e.add(e1[i]);
		}
		Iterator<Employees>itr=e.iterator();
				while(itr.hasNext())
				{
					count++;
					itr.next().display();
					
				}
		
		

	}

}
