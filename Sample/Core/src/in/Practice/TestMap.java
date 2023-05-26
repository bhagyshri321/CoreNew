package in.Practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TestMap {
	public static void main(String[] args) {
		
		HashMap map= new HashMap<>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		
	Set keys=	map.entrySet();
		
		for(Object ob:keys) {
			System.out.println(ob);
			
		}
				
		
	}

}
