package com.ust_day4;

import java.io.*;

public class Ioexception {

	public static void findFile()throws IOException{
		// TODO Auto-generated method stub
		File newFile=new File("test.txt");
		FileInputStream stream=new FileInputStream(newFile);

	}
	public static void main(String[]args) {
		try {
			findFile();
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
  
}
