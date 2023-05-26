
package com.basic;


public class Palindrome{
	public static void main(String[] args) {
		
		int no=121;
		int temp= no;
		int rev=0;
		
		while(temp!=0) {
			
	 int rem=		temp%10;
	 rev =  rev*10+rem;
	
	 temp=temp/10;
			
			
		}
		System.out.println(rev);
		if (rev==no) {
			System.out.println(no +"is palindrome");
			
		} else {
			System.out.println(no +"is not palindrome");

		}
	}
	
	
}