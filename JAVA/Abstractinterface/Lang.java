package com.ust_abstractinterfaces;
abstract class Language{
	public void display() {
		
System.out.println("This is Java Programming");
}}
public class Lang extends Language {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Lang obj=new Lang();
    obj.display();
    
	}

}
