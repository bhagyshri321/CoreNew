package in.co.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterate {
	
	public static void main(String[] args) {
		
		
		List l= new ArrayList();
		l.add(6);
		l.add(4);
		l.add(6);
	Iterator i=	l.iterator();
	while(i.hasNext()) {
	int o=	(int) i.next();
	System.out.println(o);
	}
	}

}
