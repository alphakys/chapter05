package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//C:\\Users\\gys11\\OneDrive\\바탕 화면\\tex.txt
public class CharStreamApp2 {

	public static void main(String[] args)throws IOException {
		
		
		BufferedReader br = new BufferedReader(new FileReader("C:\\\\Users\\\\gys11\\\\OneDrive\\\\바탕 화면\\\\tex.txt"));
		
		
		
		while(true) {
			String str = br.readLine();
			if(str==null) {
				break;
			}
			else {
				System.out.println(str);
			}
			
		}
	
		br.close();
	}

}
