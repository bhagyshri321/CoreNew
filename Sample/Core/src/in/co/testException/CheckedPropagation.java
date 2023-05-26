package in.co.testException;

public class CheckedPropagation {
	
public static void main(String[] args) {
	
	dad();
	
}

      private static void dad()  {
	try {
		mom();
	}catch(MistakeForChecked e) {
			 System.out.println(e.getMessage()); 
		
	}
	
}

private static void mom() throws MistakeForChecked  {
son();
	
}

private static void son() throws MistakeForChecked  {
      
     throw new  MistakeForChecked();
	
}
	



}
