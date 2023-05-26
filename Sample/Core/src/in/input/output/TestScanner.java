package in.input.output;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestScanner {
	
	public static void main(String[] args) throws IOException  {
	//reading from text file	
		/*
		 * FileReader fr= new FileReader("test.text"); Scanner sc= new Scanner(fr);
		 * 
		 * while(sc.hasNext()) { String line= sc.nextLine(); System.out.println(line); }
		 * 
		 * fr.close(); sc.close();
		 * 
		 */
		
		
   //taking input from user
		/*
		 * Scanner sc= new Scanner(System.in) ;
		 * System.out.println("Please enter your name");
		 * System.out.println("Please enter your gender");
		 * System.out.println("Please enter your age");
		 * 
		 * int age=0; String name=sc.next(); char gender = sc.next().charAt(0);
		 * try{sc.nextInt();} catch(InputMismatchException e) {
		 * 
		 * System.out.println("age should be a number"); }
		 * 
		 * System.out.println(name); System.out.println(age);
		 * 
		 * System.out.println(gender);
		 * 
		 */

		

		//taking data from user and printing it in a file
		
		  Scanner sc1 = new Scanner(System.in);
		  
		  System.out.println("Please enter your name");
		   String name1 = sc1.next();
		  
		  System.out.println("Please enter gender");
		  
		  char gender1 = sc1.next().charAt(0); System.out.println("Please enter age");
		  int age1= sc1.nextInt();
		  
		  PrintWriter pw = new PrintWriter("data.text");
		  pw.println(name1);
		  pw.println(age1);
		  
		  sc1.close();  pw.close();
		 
		}}
	
	
	


