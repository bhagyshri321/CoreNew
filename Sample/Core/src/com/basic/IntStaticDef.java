package com.basic;

public interface IntStaticDef {
	
	public  default  void def() {
		System.out.println("Hello Default");
		
	}
	
	public static void sta() {
		System.out.println("Hello static");
	}

}
