package com.basic;

public interface Test1 {
	
	public void add();
	
	public static void sta() {
		System.out.println("Hello static");
		
	}
	
	public default void def() {
		System.out.println("Hello def");
	}

}
