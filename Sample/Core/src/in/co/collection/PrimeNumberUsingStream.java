package in.co.collection;

import java.util.Arrays;
import java.util.List;

public class PrimeNumberUsingStream {
	public static void main(String[] args) {
		
	List<Integer> l=	Arrays.asList(2,4,6,7,5,3);
	l.stream().filter(e->isPrime(e)).forEach(y->System.out.println(y));
	
		
	}

	private static boolean isPrime(Integer e) {
		int count= 0;
		for(int i=2;i<=e-1;i++)
			if(e%i==0) {
				count++;
			}
		return count==0;
	}

}
