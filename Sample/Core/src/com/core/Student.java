package com.core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

public class Student implements Cloneable,Serializable  {
	
 private String n= "Bhagyshri";

public static void main(String[] args) throws Exception {
	
	
	//Student s= new Student();
	//System.out.println(s.n);
	
	Student e = (Student) Student.class.newInstance();
System.out.println(e.n);
	
	//Student r= Student.class.getConstructor().newInstance();
	//System.out.println(r.n);
	
	//Student p = new Student();
	 //Student z=(Student) p.clone();
	 //System.out.println(z.n);
	 
		/*
		 * ObjectOutputStream out = new ObjectOutputStream(new
		 * FileOutputStream("o.ser")); Student v= new Student();
		 * 
		 * out.writeObject(v);
		 * 
		 * ObjectInputStream in = new ObjectInputStream(new FileInputStream("o.ser"));
		 * in.readObject(); System.out.println(v.n); out.close(); in.close();
		 */
	
	
}}
