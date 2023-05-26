package in.imp.String;

public class fullcount {

	public static void main(String[] args) {
	
		String b= "Bhagyshri Saxena";
		String s= b.toLowerCase();
		System.out.println(s.length());
		int count=0;
		for(char a='a';a<='z';a++) {
			/* count=0; */
			for(int i=0;i<s.length();i++) {
				
				
				if(a==s.charAt(i)) {
					count++;
					
				}
				/* System.out.println(count); */
				/* System.out.println(a+" "+i); */
			}
			
			
			 if(count!=0) { System.out.println(a+" "+ count);  }count=0;
			 
		}
		
}}


