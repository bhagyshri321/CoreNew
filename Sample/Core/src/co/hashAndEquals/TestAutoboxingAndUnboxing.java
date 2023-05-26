package co.hashAndEquals;

public class TestAutoboxingAndUnboxing {
	
	public static void main(String[] args) {
		
		int i= 5;
		/*
		 * Integer o= new Integer(i);
		 * 
		 * int j= o.intValue(); System.out.println(j);
		 */
		
		Integer o = i;
		int j= o;
		System.out.println(j);
		
		double  d= 4.5;
		Double d1= d;
		double u= d1;
		System.out.println(u);
		
		
		
		
	}

}
