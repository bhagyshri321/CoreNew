package com.basic;

public class TestStringSort {
	
public static void main(String[] args) {
	
	
	TestString t= a->{
		
		String temp;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i].compareTo(a[j])>0){
					temp= a[i];
					a[i]= a[j];
					a[j]= temp;
				}
			}
		}
	for(int k=0; k<a.length;k++) {
			System.out.println(a[k]);	}
		
		
		
	};String[] h= {"Ria", "Amay", "Mahi", "Bhia"};
	t.sort(h);
	
	
}}
	

		



