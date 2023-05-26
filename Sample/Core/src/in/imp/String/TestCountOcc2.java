package in.imp.String;

public class TestCountOcc2 {

	public static void main(String[] args) {

		
		/*
		 * String s = "java"; char[] ch= s.toCharArray(); int count=0;
		 * 
		 * for(char c:ch) { count=0;
		 * 
		 * 
		 * 
		 * for(int i=0;i<ch.length;i++) {
		 * 
		 * if (ch[i]==c) { count++;
		 * 
		 * } }
		 * 
		 * System.out.println(c+" "+count);
		 * 
		 * count=0; }
		 */
		  
		 String s = "Bhagyshri Saxena";
		 char[] t= s.toCharArray();
		 int count=0;
		 for(char l: t) {
			 count=0;
			 for(int i=0;i<t.length;i++) {
				 if(t[i]!=' ') {
				 if(l==t[i]) {
					 count++;
				 }
			 }}
			 if(count!=0) {
			 System.out.println(l+" "+count);
		 }
			 }}
		 }
		 
		
		 