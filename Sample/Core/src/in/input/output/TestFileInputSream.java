package in.input.output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestFileInputSream {

	public static void main(String[] args) throws IOException {
		
		String source = "image.png";
		String target= "image2.png";
		
	FileInputStream in=	new FileInputStream(source);
	FileOutputStream out= new FileOutputStream(target);
	  int ch= in.read();
	  while (ch!=-1) {
		  out.write(ch);
	ch=	  in.read();
		
	}
	out.close();
	in.close();
	System.out.println("done");

	}

}
