package in.imp.String;

public class StringTest {
	public static void main(String[] args) {
		
		String s= "this is java";
		String[] k= s.split(" ");
		System.out.println(k.length);
		int count=0;
		
		for(String p:k) {
			for(int i=0;i<p.length();i++) {
				count++;
			}
		System.out.println(p+" ="+count);
		count=0;
		}
		
		
		 
		
		
	}

}
