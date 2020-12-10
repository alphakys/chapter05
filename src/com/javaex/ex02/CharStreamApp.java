package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//C:\\Users\\gys11\\OneDrive\\바탕 화면\\tex.txt
public class CharStreamApp {

	public static void main(String[] args)throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\\\Users\\\\gys11\\\\OneDrive\\\\바탕 화면\\\\tex.txt"));
		
		bw.write("이름:");
		bw.newLine();
		bw.write("나이:");
		bw.newLine();
		bw.write("좋아하는 사람:");
		bw.newLine();
		bw.write("너의 열정:");
		bw.newLine();
		bw.close();
		

		
	
		
		
	}

}
