package in.co.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElementUsingStream {
	
	public static void main(String[] args) {
		
	
	
	     List<Integer> l=     Arrays.asList(5,6,6,7,8,8,9);
	  Set<Integer> dup=  l.stream().filter(e->Collections.frequency(l, e)>1).collect(Collectors.toSet());
	System.out.println(dup);
	
	}
}
