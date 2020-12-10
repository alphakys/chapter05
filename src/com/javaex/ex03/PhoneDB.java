package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

public class PhoneDB {

	
	public static void main(String[] args)throws IOException {
	//C:\Users\gys11\OneDrive\바탕 화면
		//배열로
		
		Reader r = new FileReader("C:\\Users\\gys11\\OneDrive\\바탕 화면\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(r);
		
		
		
		String[] pdArr = new String[3];
		
		
		for(int i=0; i<pdArr.length;i++) {
			
			String phoneStr = br.readLine();
			pdArr[i] = phoneStr;
			
		}
		for(int i = 0;i<pdArr.length;i++) {
		String[] str = pdArr[i].split(",");
		
		String name = str[0];
		String hp = str[1];
		String company = str[2];
		
		System.out.println("이름: "+ name);
		System.out.println("핸드폰: "+ hp);
		System.out.println("회사: "+ company);
		System.out.println("");
		}
		/*
		pdArr[3] = "강용수,010-4424-2065";
	
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\gys11\\OneDrive\\바탕 화면\\PhoneDB1.txt"));
		
	
		
		for(String s : pdArr) {
			bw.write(s);
			bw.newLine();
		}
		
		bw.close();
		
		*/
	}

}
