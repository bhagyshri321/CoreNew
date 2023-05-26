package in.co.Networking;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class URLWriter {
	
	public static void main(String[] args) throws IOException {
		
		URL U = new URL("http://www.ask.com/web");
		String question ="java";
		URLConnection conn = U.openConnection();
		conn.setDoOutput(true);
		
		OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream());
		
		out.write(question);
		out.close();
		
		conn.connect();
		InputStream in = conn.getInputStream();
		Scanner sc= new Scanner(in) ;
		
		System.out.println("URL CONTENTS******");
		while(sc.hasNext()) {
		String line=	sc.nextLine();
		System.out.println(line);
		}
		sc.close();
		
		
	}
	

}
