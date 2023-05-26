package in.co.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestMarksheet {
	public static void main(String[] args) {
		
		ArrayList a= new ArrayList();
		a.add(new Marksheet("Heera", "Lal", "A1"));
		a.add(new Marksheet("Ani", "Mathur", "A3"));
		a.add(new Marksheet("Bira", "Sen", "A4"));
		a.add(new Marksheet("Bira", "Gupta", "A2"));
		
		 
		Collections.sort(a, new TestComparator());
		Iterator it= a.iterator();
		while(it.hasNext()) {
			Marksheet m= (Marksheet)it.next();
			System.out.println(m);
		}
		
	}

}
