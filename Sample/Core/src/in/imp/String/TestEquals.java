package in.imp.String;

public class TestEquals {
	public static void main(String[] args) {
		String s= "Welcome";
		String s2= "Welcome";
		System.out.println(s==s2);
		System.out.println(s.equals(s2));
		
		String s3=new String("Welcome");
		String s4= new String("Welcome");
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
	}

}
