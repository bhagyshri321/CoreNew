package com.basic;

public class MissingInArray {
	public static void main(String[] args) {
		
		
		int[] a= {10,20,30,40,50,60,70,80};
		int[] b= {10,20,70,50,30,40,60};
		
		for(int i=0;i<a.length;i++) {
			boolean pass= true;
			
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					pass=false;
				}
				
			}
			if(pass) {
				System.out.println(a[i]);
			}
		}
	}

}
