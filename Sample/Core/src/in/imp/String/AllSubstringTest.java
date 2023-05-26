package in.imp.String;

public class AllSubstringTest {
	public static void main(String[] args) {
		String y= "abc";
		
		for(int i=0;i<y.length();i++) {
			for(int j=i+1;j<=y.length();j++) {
				System.out.println(y.substring(i,j));	
			}
			
		}
		
		String j= "dog";
	j.concat(" pet");
		System.out.println(j);
		j= j.concat("pet");
		System.out.println(j);
	}

}
