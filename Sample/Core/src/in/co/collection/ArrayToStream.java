package in.co.collection;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayToStream {
	
	public static void main(String[] args) {
		
		Integer[] i= {4,5,7,8,9};
		Stream s= Arrays.stream(i);
		s.forEach(e->System.out.println(e));
		
	
		
		
	}

}
