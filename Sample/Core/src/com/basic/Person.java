package com.basic;

public class Person{
	
	public static Person p;
	
	public static  Person getInstance() {
		Person p = new Person();
		return p;
	}
	
	void show() {
		System.out.println("in show");
	}
	
	public static void main(String[] args) {
		Person p= getInstance();
		p.show();
		
	}
	
}
