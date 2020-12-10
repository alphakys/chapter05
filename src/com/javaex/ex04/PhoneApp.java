package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class PhoneApp {

	public static void main(String[] args) throws IOException{
		//C:\Users\gys11\OneDrive\바탕 화면
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\gys11\\OneDrive\\바탕 화면\\PhoneDB.txt"));
		
		ArrayList<Person> pdArr = new ArrayList<>();
		
		while(true) {
			
			String phoneStr = br.readLine();
			if(phoneStr==null) {
				break;
			}
			else {
				String[] strSplit = phoneStr.split(",");
				pdArr.add(new Person(strSplit[0],strSplit[1],strSplit[2]));
				
			}
			
		}
		
		pdArr.add(new Person("강용수","010-4424-2065","055-334-2065"));
		
	
		
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\gys11\\OneDrive\\바탕 화면\\PhoneDB4.txt"));
		
		for(int i=0;i<pdArr.size();i++) {
			
			bw.write(pdArr.get(i).getName());bw.write(",");
			bw.write(pdArr.get(i).getHp());bw.write(",");
			bw.write(pdArr.get(i).getTeleNum());
			bw.newLine();
		}
		
		bw.close();
		
		
	}

}
