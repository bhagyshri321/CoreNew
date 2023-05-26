package in.imp.String;

public class TestReverse {

	public static void main(String[] args) {

		/*
		 * String m="Bhagyshri";
		 * 
		 * for(int i=0;i<=m.length()-1;i++) {
		 * 
		 * System.out.println(m.length());
		 * 
		 *  System.out.print(m.charAt(i));
		 *  
		 *   }
		 */

		String m1 = "Bhagyshri";

		for (int i = m1.length()-1; i>=0 ; i--) {
			
			
			System.out.print(i);

			/* System.out.println(m.length()); */
			System.out.print(m1.charAt(i));
		}

	}

}
