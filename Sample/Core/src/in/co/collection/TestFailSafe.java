package in.co.collection;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class TestFailSafe {
	public static void main(String[] args) {
		
		
		ArrayBlockingQueue<Integer> l=  new ArrayBlockingQueue<>(5);
		l.add(1);
		l.add(2);
		l.add(3);
		Iterator it = l.iterator();
		l.add(4);
		l.add(5);
		
		while(it.hasNext()) {
		System.out.println(it.next());}
	}

}
