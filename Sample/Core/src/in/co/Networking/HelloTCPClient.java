package in.co.Networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class HelloTCPClient {
	public static void main(String[] args) throws IOException {
		
		Socket client = new Socket("127.0.01", 49660);
		System.out.println(client.getLocalPort());
		DataInputStream in = new DataInputStream(client.getInputStream());
		DataOutputStream out = new DataOutputStream(client.getOutputStream());
	out.writeBytes("Hello server");
	
	String greeting = in.readLine();
	System.out.println(greeting);
	client.close();
	
	
	}

}
