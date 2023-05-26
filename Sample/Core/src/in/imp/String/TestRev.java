package in.imp.String;

public class TestRev {
	
	public static void main(String[] args) {
		
		String b= "Bhagyshri Saxena";
		
		String[] t= b.split(" ");
		
		for(String B : t) {
			/* System.out.println(B); */
			
			for(int i=B.length()-1;i>=0;i--) {
				
				System.out.print(B.charAt(i));
			}
			System.out.print(" ");
			
		}
	}
	
	}
