package com.basic;

public class SmallestInArray {

	public static void main(String[] args) {
		
		int[]a= {3,5,1,6,7,3};
		int min= a[0];
		
		for(int i=1;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
          System.out.println(min);
	}

}
