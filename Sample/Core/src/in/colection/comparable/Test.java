package in.colection.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
	
	
	public static void main(String[]args) {
		ArrayList a= new ArrayList<Marksheet>();
		a.add(new Marksheet("A4", "Amit", 65));
		a.add(new Marksheet("A2", "Piya", 67));
		a.add(new Marksheet("A1", "Gia", 78));
		
		Collections.sort(a);
		for (Object o : a) {
			System.out.println(o);
			
		}
	
	}	}

	

	/*public static void main(String[] args) {
	
		Marksheet m = new Marksheet("A2", "Ankit", 65);
		Marksheet m1 = new Marksheet("A1", "Ankit", 65);
		Marksheet m3 = new Marksheet("A3", "Ankit", 65);
		ArrayList a = new ArrayList<>();
		a.add(m);
		a.add(m1);
		a.add(m3);
		Collections.sort(a);
		for(Object o:a) {
			System.out.println(o);
		}*/

		
	


