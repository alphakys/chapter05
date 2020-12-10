package com.javaex.ex04;

import java.util.ArrayList;

public class Person {
	
	private String name;
	private String hp;
	private String teleNum;
	
	
	Person(){
		
	}
	
	
	public Person(String name, String hp, String teleNum) {
		
		this.name = name;
		this.hp = hp;
		this.teleNum = teleNum;
	}
	
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getTeleNum() {
		return teleNum;
	}


	public void setTeleNum(String teleNum) {
		this.teleNum = teleNum;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", hp=" + hp + ", teleNum=" + teleNum + "]\n";
	}




	

	
	
	
	
}
