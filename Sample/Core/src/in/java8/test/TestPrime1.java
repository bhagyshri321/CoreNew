package in.java8.test;

public class TestPrime1 {
public static void main(String[] args) {
		
		PrimeInt d= (no) ->{
		
			int prime=0;
			//prime no have only tw0 divider 1 -one 2- the no itself
			//we have initiailised the value of i with 2 and till 1 less than the no itself
			//to check wher it i prime or not
			
			for(int i=2; i<=no-1; i++) {
				
				if(no%i==0) {
					prime++;
				}
				
			}
			System.out.println(no);
			System.out.println(prime);
			if(prime==0) {
				System.out.println(no+ " is prime number");
			}else {
				System.out.println(no+ " is Not Prime Number");
			}
		};
		
		d.testPrime(7);
	}


}
