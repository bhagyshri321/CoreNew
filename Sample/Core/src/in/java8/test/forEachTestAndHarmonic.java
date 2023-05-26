package in.java8.test;

import java.util.ArrayList;
import java.util.List;

public class forEachTestAndHarmonic {
	public static void main(String[] args) {
		//foreach works only on collection
		List l= new ArrayList();
		l.add("one");
		l.add("two");
		l.add("three");
		l.forEach(i->System.out.println(i));
		
		System.out.println("----------ForLoop---------");
		int n=5;
		double r=0.0;

		for(int i=n;i>0;i--) {
			r=r+(double)1/n;
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
			}
		
		int a= 40;
		int b=60;
		a= a+b;
		b=a-b;
		a= a-b;
		System.out.println(a+ " "+b);
		
		int v= 30;  int q= 40; int c=0;
		c= v;
		v=q;
		q=c;System.out.println(v+" "+q);
		
		
		
		for (int i = 1; i <=5; i++) {
			for (int j = 5; j >=i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <=i; j++) {
				System.out.print(j);// if put j + " " then it will print pyramid
			}
		System.out.println();
		}

	}
}
