
package com.ust_polyinheritabstract;

public class Gotint {
	//this method accepts int
	private static void display(int a) {
		System.out.println("Got Integer data.");
	}
	//this method accepts string objects
	private static void display(String a) {
		System.out.println("Got String object.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        display(1);
        display("Hello");
	}

}
