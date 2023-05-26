package com.basic;

public class Test123 {
	public static void main(String[] args) {
		
   int[] p = {4,5,3,7,8};
   int largest=0; 
   int sec= 0;
   
   for(int i=0;i<p.length;i++) {
	   if(p[i]>largest) {
		   sec= largest;
		   largest= p[i];
	   }
	   if(p[i]>sec && p[i]!=largest) {
		   sec= p[i];
	   }
	   
   }System.out.println(sec);
 }

  
	}
		 
	
	


