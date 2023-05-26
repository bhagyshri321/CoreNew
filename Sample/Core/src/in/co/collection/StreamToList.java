package in.co.collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamToList {
	public static void main(String[] args) {
		
	List<Integer> l= 	Arrays.asList(1,3,4,5,6);
	List<Integer> l3=  l.stream().collect(Collectors.toList());
	System.out.println(l3);
		
	}

}
