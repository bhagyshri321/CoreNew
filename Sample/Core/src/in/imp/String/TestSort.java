package in.imp.String;

public class TestSort {
	public static void main(String[] args) {
		
	
		
		  String s= "bhagyshri"; 
		  char[] t= s.toCharArray();
		  for(int i=0;i<t.length;i++)
		  { for(int j=i+1;j<t.length;j++) { 
			  if(t[i]>t[j])
			  { char temp = t[i]; 
			  t[i]= t[j];
		  
			  t[j]= temp; }
			  }
		  
		}
		/* for(char k:t) */ System.out.print(t);
		 
	
	
		//operator;
		
		/*
		 * int p=0; System.out.println(p++ + p);
		 */
		  
		/* System.out.println(++i + ++i + ++i + ++i + ++i + ++i); */
		 
	
	
	
	//string bubble sort
		/*
		 * String str[] = { "Ajeet", "Steve", "Rick", "Becky", "Mohan"}; String temp;
		 * System.out.println("Strings in sorted order:"); for (int j = 0; j <
		 * str.length; j++) { for (int i = j + 1; i < str.length; i++) { // comparing
		 * adjacent strings if (str[i].compareTo(str[j]) < 0) { temp = str[j]; str[j] =
		 * str[i]; str[i] = temp; } } System.out.println(str[j]); }
		 */

	}
}
