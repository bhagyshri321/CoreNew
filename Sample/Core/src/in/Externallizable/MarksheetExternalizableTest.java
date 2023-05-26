package in.Externallizable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MarksheetExternalizableTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileOutputStream file = new  FileOutputStream("data.text");
		ObjectOutputStream out = new ObjectOutputStream(file);
	Marksheet m= new Marksheet();
	
		
		out.writeObject(m);
		out.close();
		file.close();
		System.out.println("Object is succesfully persisted");
		
		
		FileInputStream in = new FileInputStream("data.text");
		ObjectInputStream  ob = new ObjectInputStream(in);
		Marksheet m1 = (Marksheet)ob.readObject();
		System.out.println(m1.getName());
		 System.out.println(m1.getTemp()); 
		/* System.out.println(m1.getlname()); */
		/* System.out.println(m1.getTemp()); */
		ob.close();
		in.close();
		
		
	}

}
