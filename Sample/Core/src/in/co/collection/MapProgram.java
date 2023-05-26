package in.co.collection;

import java.util.Arrays;
import java.util.List;

public class MapProgram {
	
	public static void main(String[] args) {
		
	List<Integer> l=	Arrays.asList(2,5,6,7);
	
	l.stream().map(e->e*e).forEach(e->System.out.println(e));
		
	}

}
