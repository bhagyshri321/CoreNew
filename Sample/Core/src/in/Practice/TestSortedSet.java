package in.Practice;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestSortedSet {
	
	public static void main(String[] args) {
		
		SortedSet s= new TreeSet();
		/*
		 * s.add(null); s.add(null);
		 */
		s.add("two");
		s.add("three");
		s.add("four");
		
	Iterator it= s.iterator();
	while (it.hasNext()) {
		Object object = (Object) it.next();
		
		System.out.println(object);
		
	}

		
	}
	}


