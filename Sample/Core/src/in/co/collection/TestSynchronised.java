package in.co.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TestSynchronised  extends Thread{
	private static Map<String, Integer> hm= Collections.synchronizedMap((new HashMap<String,Integer>()));
	public void run() {
		hm.put("nine", 9);
	}
	
	public static void main(String[] args) {
		
		hm.put("one", 1);
		hm.put("two", 2);
		hm.put("three", 3);
		
		TestSynchronised t1= new TestSynchronised();
		t1.start();
		for(Object o: hm.entrySet()) {
			System.out.println(o);
		}
		
	}

}
