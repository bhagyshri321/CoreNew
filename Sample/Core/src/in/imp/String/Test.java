package in.imp.String;

public class Test {
	public static void main(String[]args) {
		String s= "This is java";
		
		System.out.println(s.replaceAll("j(.*)", "*"));
		System.out.println(s.substring(0,5));
		System.out.println(s.substring(9));
		
		
		
String a= "Abhishek Patidar";
		
		System.out.println("Length of String :- "+a.length());
		System.out.println(" 5th Character of String :- "+a.charAt(4));
		System.out.println("Index of Abhishek :- "+a.indexOf("Patidar"));
		System.out.println("1st Index of i :- " +a.indexOf("i"));
		System.out.println("Last  Index of i :- " +a.lastIndexOf("i"));
		System.out.println(" a is replaced by k :- "+a.replace("a", "k"));
		System.out.println("Lowercase :- "+a.toLowerCase());
		System.out.println("Uppercase :- "+ a.toUpperCase());
		System.out.println("Starts with Abhishek :- "+a.startsWith("Abhishek"));
		System.out.println("Starts with Sirname :- " +a.substring(9));
		
		
	//String to char Array	
	String k= "Bhagyhsri";	
	 char[] j=  k.toCharArray();
	 for(int i=0;i<j.length;i++) {
		 System.out.print(j[i]);
	 }
			
		
		

	}

}
