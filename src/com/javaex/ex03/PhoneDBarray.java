package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

public class PhoneDBarray {

	public static void main(String[] args)throws IOException {
	//C:\Users\gys11\OneDrive\바탕 화면
		//배열로
		
		Reader r = new FileReader("C:\\Users\\gys11\\OneDrive\\바탕 화면\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(r);
		
		
		
		ArrayList<String> pdArr = new ArrayList<>();
		
		
		while(true) {
			
			String phoneStr = br.readLine();
			if(phoneStr==null) {
				break;
			}
			else {
				pdArr.add(phoneStr);
			}
			
		}
		
	
		
		pdArr.add("강용수,010-4424-2065");
	
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\gys11\\OneDrive\\바탕 화면\\PhoneDB2.txt"));
		
	
		
		for(String s : pdArr) {
			bw.write(s);
			bw.newLine();
		}
		
		bw.close();
		
		
	}
 

	

}
