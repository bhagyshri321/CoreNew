package in.input.output;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestBufferedInputStream {

	public static void main(String[] args) throws IOException {
	//binary data ke liy just like fileinputstream and fileoutputstream	
	
	
 BufferedInputStream bf= new BufferedInputStream(new FileInputStream("image.png"));
 
BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream("image.png"));
 
byte[] buff= new byte[256];
int ch= bf.read();
while(ch>0) {
	bo.write(buff,0,ch);
	ch= bf.read();
}
bo.close();  bf.close();


}}
