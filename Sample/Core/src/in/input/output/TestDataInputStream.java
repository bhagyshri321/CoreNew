package in.input.output;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataInputStream {
	public static void main(String[] args) throws IOException {
		//write primitive data 
    DataOutputStream out = new DataOutputStream(new FileOutputStream("binary.dat"));
    out.writeInt(1);
    out.writeBoolean(true);
    out.writeChar('a');
    out.writeDouble(1.3);
    out.close();
    
	//read data
 DataInputStream in=   new DataInputStream(new FileInputStream("binary.dat"));
 System.out.println(in.readInt());
 System.out.println(in.readBoolean());
System.out.println(in.readChar()); 
System.out.println(in.readDouble()); 
 in.close();

	}

}
