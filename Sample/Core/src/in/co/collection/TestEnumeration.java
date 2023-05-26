package in.co.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class TestEnumeration {
	public static void main(String[] args) {
		
		Vector v= new Vector();
		v.add(5);
		v.add(6);
		v.add(3);
		
		Enumeration e= v.elements();
		while(e.hasMoreElements()) {
		Object o=	e.nextElement();
		System.out.println(o);}
		
	Iterator i=	v.iterator();
	while(i.hasNext()) {
	Object k=	i.next();
	
	System.out.println(k);
	}
			
		
			
		}
				
		
		
	}


