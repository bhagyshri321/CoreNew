 package in.input.output;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestPrintWriter {
	public static void main(String[] args) throws IOException {
		
	FileWriter fw= new FileWriter("test.text", true);
	PrintWriter pw = new PrintWriter(fw);
	pw.println("Hey, How are you");
	pw.println("I am fine thank you");
	
	fw.close(); pw.close();
	System.out.println("done");
	
	}

}
