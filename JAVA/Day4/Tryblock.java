package com.ust_day4;

import java.io.BufferedReader;
import java.io.*;

public class Tryblock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line;
		try(BufferedReader br=new BufferedReader(new FileReader("test.txt"))){
			while((line=br.readLine())!=null){
				System.out.println("Line=>"+line);
				
			}
			
		}catch(IOException e) {
			System.out.println("IOException in try block=>"+e.getMessage());
		}

	}

}
