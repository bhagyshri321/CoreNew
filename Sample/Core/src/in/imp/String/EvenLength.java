package in.imp.String;

public class EvenLength {
	public static void main(String[] args) {//even length program is below
	
		String k= "the quick brown";
		int vowelcount=0;
		int constantcount=0;
		for(int i=0;i<k.length();i++) {
			if(k.charAt(i)=='a'|| k.charAt(i)=='e'||k.charAt(i)=='i'||k.charAt(i)=='o'||k.charAt(i)=='u') {
				
				vowelcount++;
				System.out.println(k.charAt(i));
			}else {
				if(k.charAt(i)!=' ') {constantcount++;}
				
			}
			
		}
		System.out.println(vowelcount);	
		System.out.println(constantcount);
		
		//prints only  words having even count 		
		//even length program	
		String q= "my name is khan sahab";
		String[] a = q.split(" ");
	
		for(String j:a) {
		if(j.length()%2==0) {
			System.out.println(j);
		}
		

			
		
		}
		
		}
			
		}
						
					
				
				
			
				
			
		
	
		
	


