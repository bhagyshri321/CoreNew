package in.co.testException;

public class Test {

	public static void main(String[] args) {
         
		
		int[] t4= {1,3,2};
		/* String s= "Bhag"; */
		/* String t = null; */

		try {
			/* System.out.println(s.charAt(6)); */
			/* System.out.println(t.length()); */
			System.out.println(t4[4]);
				System.exit(0);
		}

		/*
		 * catch(StringIndexOutOfBoundsException e) {
		 * System.out.println("String is small");  }
		 */

		catch (NullPointerException p) {
			System.out.println("String is null");
		}
		
		catch(IndexOutOfBoundsException e) {
			 System.out.println("Array is small");
		
			
		}

		finally {
			System.out.println("I am final");
		}
	}

}
