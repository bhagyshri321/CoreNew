package co.hashAndEquals;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		
		/*
		 * List<Marksheet> l = new ArrayList<>();
		 * 
		 * l.add(new Marksheet("101", "yash", 90)); l.add(new Marksheet("102", "mukesh",
		 * 87)); l.add(new Marksheet("103", "jay", 89)); l.add(new Marksheet("104",
		 * "dhruvi", 76));
		 * 
		 * for (Marksheet mark : l) {
		 * 
		 * System.out.println(mark); }
		 */
		
		
		Marksheet m = new Marksheet("101", "jay", 78);
		Marksheet m1 = new Marksheet("101", "jay", 78);
	System.out.println(m.equals(m1));	
	System.out.println(m.hashCode());
	System.out.println(m1.hashCode());
		
		
		
		
	}

}
