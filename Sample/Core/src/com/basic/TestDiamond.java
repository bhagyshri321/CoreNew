package com.basic;

import java.nio.charset.MalformedInputException;

public class TestDiamond {
	
	public static void main(String[] args) {
		
		int n = 3;
		int p = 5;
		
		for (int i = n; i >1; i--) {
			for (int j = 1; j <i; j++) {
				System.out.print(" ");
			}
		for (int j = i; j <=n; j++) {
			System.out.print(p + " ");
		}
		System.out.println();
		p--;
		}
	for (int i = 1; i <=n; i++) {
		for (int j = 1; j <i; j++) {
			System.out.print(" ");
	}
	for (int j = i; j <=n; j++) {
		System.out.print(p + " ");
	}
	System.out.println();
	p--;

	}
System.out.println("----------------------------------------------------------------");



       int z = 3;



for (int i = 1; i <= z; i++) {
	for (int j = 1; j <= z - i; j++)

	{
		System.out.print(" ");
	}

	for (int j = 1; j <= i * 2 - 1; j=j+2)

	{
		System.out.print(i+ " ");
		
	}
	System.out.println();

}
for (int i = z - 1; i > 0; i--) {
	for (int j = 1; j <= z - i; j++)

	{
		System.out.print(" ");
	}
	for (int j = 1; j <= i * 2 - 1; j=j+2)

	{
		System.out.print(i+" ");
	}
	System.out.println();}





System.out.println("-------------------------------------------------------");
         int j = 5;

for (int i = 5; i >= 1; i--) {

	if (i != 3 && i % 2 != 0) {
		System.out.print(" " + " " + i);
		System.out.println();
	}
	if (i % 2 == 0) {
		System.out.print(" " + i + " " + i);
		System.out.println();
	}
	if (i == 3) {
		System.out.println(i + " " + i + " " + i);
	}
}
}}
