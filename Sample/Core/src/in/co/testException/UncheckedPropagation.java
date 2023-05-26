package in.co.testException;

public class UncheckedPropagation {
	
 public static void main(String[] args) {
	
	 dad();
}

private static void dad() {
	try{mom();}
	catch(RuntimeException e) {
		System.out.println("son made mistake");
	}
	
}

private static void mom() {
	son();
	
}

private static void son() {
	RuntimeException e= new RuntimeException();
	throw e;
	
}
}
