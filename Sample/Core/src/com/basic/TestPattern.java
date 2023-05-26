package com.basic;

public class TestPattern {
	public static void main(String[] args) {

		int i, j;

		for (i = 1; i <= 5; i++) {
			for (j = 5; j >= i; j--) {
				System.out.print(i);

			}
			System.out.println();
		}

		System.out.println("-------------------------2-------------");

		int a, b;

		for (a = 1; a <= 5; a++) {
			for (b = 1; b <= a; b++) {
				System.out.print(b);
			}
			System.out.println();
		}

		System.out.println("------------------3--------------------");

		// int a,b;

		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

		System.out.println("----------------4----------------------");

		// int a,b;
		
		  
		  for(i=5;i>=1;i--) { for(j=1;j<=i;j++) { System.out.print(i); }
		  System.out.println(); }
		 

		System.out.println("-----------------------5--------------------------");

		int count = 0;
		for (i = 1; i <= 4; i++) {
			for (j = 1; j <= i; j++) {
				count++;
				System.out.print(count);
			}
			System.out.println();

			System.out.println("----------------------6--------------------------");

			for (i = 1; i <= 4; i++) {
				for (j = i; j >= 1; j--) {
					System.out.print(" " + j);
				}
				System.out.println();
			}
		}
		System.out.println("--------------------------7--------------------------");

		for (i = 1; i <= 4; i++) {
			for (int k = 1; k <= i; k++) {
				System.out.print(" " + k);
			}
			for (j = i - 1; j >= 1; j--) {
				System.out.print(" " + j);
			}
			System.out.println();
		}

		System.out.println("---------------Pyramid Pattern-----------------");
		
		  for(i=1;i<=4;i++) { for(j=4;j>=i;j--) { System.out.print(" "); } for(int
		  m=1;m<=i;m++) { System.out.print(" *"); } System.out.println();}
		 

		System.out.println("--------------------Triangle--------------------------");

		for (i = 1; i <= 4; i++) {
			for (j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (int f = 1; f <= i; f++) {
				System.out.print("*");
			}
			for (int p = 2; p <= i; p++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------------------Triangle2--------------------------");

		for (i = 1; i <= 4; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 4; k >= i; k--) {
				System.out.print("*");
			}
			for (int t = 3; t >= i; t--) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("-----------------Number Pattern--------------------------------------");

		/*
		 * for (int w = 1; w <= 4; w++) { for (int v = 4; v >= w; v--) {
		 * System.out.print(" "); } for (int k = 1; k <= w; k++) { System.out.print(w +
		 * " "); } System.out.println(); }
		 */
		
		
		
	System.out.println("-------------------1-----------------------");

		int m = 0;
		for (int w = 1; w <= 4; w++) {
			for (int v = 4; v >= w; v--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= w; k++) {
				m++;
				System.out.print(m + " ");
			}
			System.out.println();
		}
		System.out.println("------------------2---------------------");

		/*
		 * for (i = 1, b = 5; i <= 5; i++, b--) { for (j = 1; j <= i; j++) {
		 * System.out.print(b + " "); } System.out.println(); }
		 */
		
		
		
		System.out.println("----------------3----------------------");

		/*
		 * for (i = 1, m = 5; i <= 5; i++, m--) { for (j = 1; j <= i; j++) {
		 * System.out.print(" "); } for (int r = 5; r >= i; r--) { System.out.print(m +
		 * " "); } System.out.println(); }
		 */

		
		
		System.out.println("----------------4---------------");

		/*
		 * for (i = 1, m = 5; i <= 5; i++, m--) { for (j = 5; j >= i; j--) {
		 * System.out.print(" "); } for (int h = 1; h <= i; h++) { System.out.print(m);
		 * } for (int n = 2; n <= i; n++) { System.out.print(m); } System.out.println();
		 * }
		 */
		
		for(int e=1, d=5;e<=5;e++,d--) {
			for(int g=5;g>=e; g--) {
				System.out.print(" ");
			}
			for(int u=1;u<=e;u++) {
				System.out.print(d);
			}
			for(int c= 2;c<=e;c++) {
				System.out.print(d);
			}
			System.out.println();
		}
		System.out.println("-----------------5------------------");

		for (i = 1, m = 5; i <= 5; i++, m--) {
			for (j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int r = 5; r >= i; r--) {
				System.out.print(m);
			}

			for (int k = 4; k >= i; k--) {
				System.out.print(m);
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------------");
		for(int g= 1,m1=5;g<=5;g++,m1--) {
			for(int u=5;u>=g;u--) {
				System.out.print(" ");
			}
			for(int y=1;y<=g;y++) {
				System.out.print(m1+" ");
			}
			System.out.println();
		}
System.out.println("---------------------------------------");
		for(int g= 1;g<=5;g++) {
			for(int u=5;u>=g;u--) {
				System.out.print(" ");
			}
			for(int y=1,n=5;y<=g;y++,n--) {
				System.out.print(n+" ");
			}
			System.out.println();
		}
	}
}
