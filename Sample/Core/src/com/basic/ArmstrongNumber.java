package com.basic;

public class ArmstrongNumber{
	
	public static void main(String[] args) {
		
		int no= 153;
		int temp= no;
		int l=0;
		
		while(no!=0) {
			l++;
			no=no/10;
		}
		int t2= temp;
		int rem;
		int arm=0;
		while(t2!=0) {
			rem= t2%10;
			int mul=1;
			for(int i=1;i<=l;i++) {
				mul= mul*rem;
			}
			arm= arm+mul;
			t2=t2/10;
		}
		
		if(arm==temp) {
			System.out.println(temp+"is arm");
		}
	}
	
	
	

}