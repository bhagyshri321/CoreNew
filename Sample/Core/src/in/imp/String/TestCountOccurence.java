    package in.imp.String;

public class TestCountOccurence {
	
	public static void main(String[] args) {
		
	
	
	String B= "BhagyhshriSaxena";
	
	System.out.println(B.length());
	
	char r= 'a';
	
	int s= 0;
	
	for(int i=0;i<=B.length()-1;i++) {
		
		if(r==B.charAt(i)) {
			
			s++;
		}
		
	}
	System.out.println(s);
		
	}

}
