package in.input.output;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
	
	public static void main(String[] args) throws IOException {
		/*//FileWriter
		 * FileWriter file = new FileWriter("file.text", true);
		 * file.write("My name is Lakhan"); char[] a= {'a','b'};
		 * 
		 * file.write(a); System.out.println("completed"); file.close();
		 */
		
		
		/*//FileReader
		 * FileReader r= new FileReader("file.text"); int ch= r.read(); char chr;
		 * 
		 * while(ch!=-1) { chr= (char)ch; System.out.println(chr); ch= r.read(); }
		 * r.close();
		 */
       
     //BufferedReader by character  
		/*
		 * FileReader t= new FileReader("file.text"); BufferedReader br= new
		 * BufferedReader(t); int ch= br.read(); char chr;
		 * 
		 * while(ch!=-1) { chr= (char)ch; System.out.println(chr); ch= br.read();
		 * 
		 * }br.close(); t.close();
		 */
		
		
	//BufferedReader by Line
		
		FileReader G= new FileReader("file.text");
		BufferedReader v= new BufferedReader(G);
		
		String line= v.readLine();
		while(line!=null) {
			System.out.println(line);
			line= v.readLine();
		}
		v.close();  G.close();
     
		
		
		
		 
		
		
		
		
		
		
	}

}
