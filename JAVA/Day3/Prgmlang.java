package com.ust_day3;

public class Prgmlang {

	public static void main(String[] args) {
		String str1="C++ Programming";
		//all occurrrences of "c++" is replaced with "java"
        System.out.println(str1.replace("C++","Java"));//java programming
        
        //all occurances of "aa" is replaced with "zz"
        System.out.println("aa bb aa zz".replace("aa","zz"));//zz bb zz zz
        //substring not in the string
        System.out.println("Java".replace("C++","c"));//Java
        
	}

}
