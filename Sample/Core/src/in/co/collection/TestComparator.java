package in.co.collection;

import java.util.Comparator;

public class TestComparator implements Comparator<Marksheet> {

	
	public int compare(Marksheet m, Marksheet m1) {
		if (m.fname==m1.fname) {
			return m.lname.compareTo(m1.lname);
			
		} else {
             return m.fname.compareTo(m1.fname);
		}
		
	}
	

}
