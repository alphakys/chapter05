package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
public class ByteStreamApp {

	public static void main(String[] args) throws IOException{
		
		InputStream in = new FileInputStream("C:\\Users\\gys11\\OneDrive\\바탕 화면\\JavaStudy\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\Users\\gys11\\OneDrive\\바탕 화면\\JavaStudy\\byteimg.jpg");
		
		while(true) {
			
			int bData = in.read();
			
			out.write(bData);
			
			if(bData==-1) {
				break;
			}
		}
		
		out.close();
		in.close();
		
		
		
	}

}
