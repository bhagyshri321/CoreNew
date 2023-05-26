package com.basic;

public class HarmonicSeries {
	public static void main(String[] args) {
		
		System.out.println("----------ForLoop---------");
		int n=5;
		double r=0.0;

		for(int i=n;i>0;i--) {
			r=r+(double)1/n;// first we convert 1/n to double eg 1/5=0.2, 1/4= 0.25
			n--;
			System.out.println(r);
		}
		
		
		System.out.println("------------------------------");

		
		  n= 5;
		  r= 0.0;
		  for(int i=n;n>=1;i--) {
			  System.out.println(i);
			  System.out.println(n);
			  r= r+(double)1/n;
			  n--;
			  System.out.println(r);
		  }
		
		
		

		System.out.println("----------WhileLoop---------");
		int num=5;
		double result=0.0;

		while(num>0) {
			result = result+(double)1/num;
			num--;
			System.out.println(result);

		
	}}}


