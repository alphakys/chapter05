package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
//C:\\Users\\gys11\\OneDrive\\바탕 화면\\MS949.txt
public class MS949App {

	public static void main(String[] args)throws IOException {
		
		/*
		Reader r = new FileReader("C:\\Users\\gys11\\OneDrive\\바탕 화면\\MS949.txt");
		BufferedReader br = new BufferedReader(r);
		*/
		
		InputStream in = new FileInputStream("C:\\Users\\gys11\\OneDrive\\바탕 화면\\MS949.txt");
		
		InputStreamReader ir = new InputStreamReader(in, "MS949");
		BufferedReader br = new BufferedReader(ir);
		
	
		
		while(true) {
			
			String str = br.readLine();
			if(str==null) {
				break;
			}
			else {
				System.out.println(str);
			}
		}
		
		
		
	}

}
