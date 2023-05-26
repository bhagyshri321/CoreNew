package in.co.Networking;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class URLReader {
	
	public static void main(String[] args) throws IOException {
		URL u= new  URL("http://www.sunilos.com:80/Home");
		System.out.println(u.getProtocol());
		System.out.println(u.getHost());
		System.out.println(u.getPort());
		System.out.println(u.getFile());
		InputStream in=          u.openStream();
		Scanner sc = new Scanner(in);
		while(sc.hasNext()) {
		String html=	sc.nextLine();
		System.out.println(html);
		
		}
		sc.close();
		
	}

}
