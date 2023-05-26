package in.imp.String;

public class TestConstructors {
	public static void main(String[] args) {
		//empty construtor
		String s= new String();
		System.out.println(s.length());
		//String literal constructor
		String s2= new String("Bhagyhsri");
		//String Buffer construcor
		StringBuffer sb= new StringBuffer("Deepak");
		String s3= new String(sb);
		System.out.println(s3);
		//stringBuilder construcor
		StringBuilder s4= new StringBuilder("Deepak");
		
		//byte constructor
		byte[] b= {102,103,104};
		String t= new String(b);
		System.out.println(t);
		//char costructor
		char[] a= new char[] {'a','b','c'};
		char[] g= new char[] {'b','f'};
		System.out.println(g);
		System.out.println(a);
		/*
		 * String k= new String(a); System.out.println(k);
		 */
	}

}
