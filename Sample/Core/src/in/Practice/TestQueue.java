package in.Practice;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
	public static void main(String[] args) {
		
		Queue q= new LinkedList();
	
		
		q.offer(23);
		q.add(56);
		
		/* System.out.println(q.element()); */
		
		System.out.println(q.remove());
		
		
	 for(Object j:q) { System.out.println(j); }
		 
	}
	
	Queue q1= new LinkedList();

	

}
