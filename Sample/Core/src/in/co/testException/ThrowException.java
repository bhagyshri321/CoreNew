package in.co.testException;

public class ThrowException {
	
	public static  boolean isVlaidUser() {
		return false;
	}
	public static void main(String[]args) {
		boolean userfound =  isVlaidUser();
		
		if(userfound) {
			System.out.println("valid user");
			
		}else {
			try{RuntimeException e= new RuntimeException();
		throw e;}
			
		catch(RuntimeException e) {
			System.out.println("invalid user");
		}
		
		}
		
	
			
		
	}
}
