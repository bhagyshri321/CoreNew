package in.imp.String;

public class PalindromeTest {
	public static void main(String[] args) {//extract last name is below
		String t= "jalaj";
		String p= "";
		
		for(int i=t.length()-1;i>=0;i--) {
			p= p+t.charAt(i);
		}
		if(t.equals(p)) {
			System.out.println(t +" is palindrome");
		}else {
			System.out.println(t+"is not palindrome");
		}
		
		
		String j= "Bhagyshri Saxena";
	String[] k=	j.split(" ");
	String i= k[k.length-1];
	System.out.println(i);
	}
}
