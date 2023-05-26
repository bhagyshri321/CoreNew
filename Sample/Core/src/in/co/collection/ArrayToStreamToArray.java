package in.co.collection;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayToStreamToArray {
	
	public static void main(String[] args) {
		int[] i= {1,2,3,4,5};
		IntStream t= Arrays.stream(i);
		int[] s= t.distinct().sorted().limit(2).toArray();
		for(int r:s) {
			System.out.println(r);
		}
		
		
	}

}
