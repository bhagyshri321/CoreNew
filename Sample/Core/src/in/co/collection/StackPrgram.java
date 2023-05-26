package in.co.collection;

import java.util.Stack;

public class StackPrgram {
	public static void main(String[] args) {
		
		Stack s= new Stack();
		for(char i='a';i<='z';i++) {
			
		}
		
		Stack r= new Stack<>();
		while(!s.isEmpty()) {
			System.out.println(r.push(s.pop()));
			
			
		}
		while(!r.isEmpty()) {
			System.out.println(s.push(r.pop()));
		}
		
		
	}

}
