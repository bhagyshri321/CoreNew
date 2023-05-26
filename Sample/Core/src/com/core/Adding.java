package com.core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Adding {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream file = new FileOutputStream("ob.ser");
		ObjectOutputStream out =  new ObjectOutputStream(file);
		
		MarksheetBean m= new MarksheetBean();
		m.setName("Ria");
		out.writeObject(m);
		
		
		FileInputStream file1 = new FileInputStream("ob.ser");
		ObjectInputStream  in = new ObjectInputStream(file1);
	MarksheetBean m1=	(MarksheetBean) in.readObject();
	System.out.println(m1.getName());
		
	}
	
	

}
