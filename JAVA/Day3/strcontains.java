package com.ust_day3;

public class strcontains {

	public static void main(String[] args) {
	String str1="Learn Java";
	String str2="Java";
	String str3="java";
	Boolean result;
	
	//true because"Learn Java" contains"java"
	if(str1.contains(str2)) {
		
		System.out.println(str1+"contains"+str2);
		
	}
	else {
		System.out.println(str1+"doesn't contains"+str2);
		
	}
      
	if(str1.contains(str3)) {
		System.out.println(str1+"doesn't contains"+str3);
	}
	else {
		System.out.println(str1+"doesn't contains"+str3);
		
	}

}
}