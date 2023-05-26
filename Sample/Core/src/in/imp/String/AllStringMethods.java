package in.imp.String;

public class AllStringMethods {

	public static void main(String[] args) {
		
		String k= "Bhagyshri Saxena";
		
		
		  System.out.println(k.length()); System.out.println(k.charAt(0));
		  System.out.println(k.indexOf(" ")); System.out.println(k.replace("a",
		  "A"));//imp System.out.println(k.toLowerCase());
		  System.out.println(k.toUpperCase()); System.out.println(k.indexOf("a"));
		  System.out.println(k.lastIndexOf("a"));//imp
		  System.out.println(k.lastIndexOf("h"));//imp
		  System.out.println(k.startsWith("Bhagyshri"));
		  System.out.println(k.replaceAll("B", "A"));//imp
		  System.out.println(k.substring(2));//imp
		 
		 	
		
		/*
		 * String s = " "; System.out.println(k.indexOf("h"));
		 * System.out.println(k.charAt(3)); System.out.println(k.substring(0, 9));
		 * System.out.println(k.substring(9)); System.out.println(s.isEmpty());
		 * System.out.println(s.length());
		 */
	
	//nullpointer exception
	String n= null;
		/* System.out.println(n.contains(n)+ " "+n.length()); */
	
		
	StringBuffer sb= new StringBuffer("This is java");
	
	sb.insert(8, "Hello");
	System.out.println(sb);
	System.out.println(sb.delete(7, 12));
	
	System.out.println(sb);

		
	}}

	


