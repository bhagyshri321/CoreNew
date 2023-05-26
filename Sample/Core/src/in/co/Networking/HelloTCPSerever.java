package in.co.Networking;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class HelloTCPSerever {
	public static void main(String[] args) throws IOException {
		
	
	
	ServerSocket server = new ServerSocket(9090);
	Socket client =  server.accept();
	DataInputStream in = new DataInputStream(client.getInputStream());
DataOutputStream out = new DataOutputStream(client.getOutputStream());
          String greeting=               in.readLine();
          System.out.println(greeting);
          
          out.writeBytes("hello client");
          
          client.close(); server.close();
}}
