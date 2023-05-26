package in.co.collection;

import java.util.Arrays;
import java.util.List;

public class FilterandMap {
	
	public static void main(String[] args) {
		
	List<Integer> l=	Arrays.asList(5,6,2,3,4);
	
	l.stream().filter(e->e%2==0).map(e->e*e).forEach(m->System.out.println(m));
	System.out.println("------------------------------");
	l.stream().map(e->e*e).sorted().forEach(b->System.out.println(b)
			);
	}

}
