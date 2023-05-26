package in.input.output;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/*keyboard se data lekar file me print karega quit
 *  likhna hai jab 
file me data likhna khatam kar de tab*/

public class TestInputStreamReader {
	public static void main(String[] args) throws IOException {
		
PrintWriter pw = new PrintWriter(new FileWriter("test.text", true));
InputStreamReader in= new InputStreamReader(System.in);

BufferedReader br = new BufferedReader(in);

String line = br.readLine();

while(!line.equals("quit")) {
	pw.println(line);
	line= br.readLine();
}

br.close(); in.close(); pw.close();
		
		
		
		
	}

}
