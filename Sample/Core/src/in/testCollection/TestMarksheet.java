package in.testCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestMarksheet {

	public static void main(String[] args) {
		
		
		Marksheet m1= new  Marksheet();
		m1.setFname("Radha");
		m1.setLname("Sharma");
		m1.setRollno("1");
		m1.setChem(65);
		m1.setPhy(56);
		m1.setMaths(78);
		
		Marksheet m2= new Marksheet();
		m2.setFname("Priyal");
		m2.setLname("Gupta");
		m2.setRollno("2");
		m2.setMaths(80);
		m2.setChem(78);
		m2.setPhy(90);
		
		
		Marksheet m3= new Marksheet();
		m3.setFname("Athiya");
		m3.setLname("Datt");
		m3.setRollno("3");
		m3.setMaths(80);
		m3.setChem(78);
		m3.setPhy(90);
		
		ArrayList a= new ArrayList();
		a.add(m1);
		a.add(m2);
		a.add(m3);
		
		
		Collections.sort(a , new TestComparator());
		
		Iterator it = a.iterator();
		while (it.hasNext()) {
			Marksheet m = (Marksheet) it.next();
			
			System.out.println(m.getRollno() + " " + m.getFname() + " " + m.getLname() + " " + m.getMaths() + " "
				+ m.getChem() + " " + m.getPhy());
			
		}
		

	}

}
