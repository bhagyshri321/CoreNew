package com.basic;

public class SecondLargest {

	public static void main(String[] args) {
		
		int[] a = { 200, 145,600, 150, 160, 800, 60, 500 };
		int largest = 0;
		int seclarge = 0;

		for (int i = 0; i < a.length; i++) {
			if (largest < a[i]) {
				seclarge = largest;
				largest = a[i];
			}
			if (seclarge < a[i] && a[i] != largest) {
				seclarge = a[i];
			}
		}

		System.out.println(seclarge);

		System.out.println("-----------------");


}}
