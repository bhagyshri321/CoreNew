
package in.input.output;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EmailReader {
	
	public static void main(String[] args) throws IOException {
		
		FileReader file = new FileReader("test.text");
		BufferedReader br = new BufferedReader(file);
		
	String line=	br.readLine();
	
	while (line!=null) {
		if(line.matches("^(.+)@(\\S+)$")) {
			System.out.println(line);
		}
		
	 line=	br.readLine();
		
	}
	
	br.close();
	file.close();
		
		
	}

}
