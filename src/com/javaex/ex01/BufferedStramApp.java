package com.javaex.ex01;

import java.io.*;

public class BufferedStramApp {

	public static void main(String[] args) throws IOException {
			
		InputStream in = new FileInputStream("C:\\Users\\gys11\\OneDrive\\바탕 화면\\JavaStudy\\img.jpg");
		BufferedInputStream bin = new BufferedInputStream(in);
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	
		
	}

}
