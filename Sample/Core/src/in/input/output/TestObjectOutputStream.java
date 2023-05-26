package in.input.output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import in.testCollection.Marksheet;

public class TestObjectOutputStream {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
		//serialise object
		FileOutputStream  file = new FileOutputStream("obj.ser");
		ObjectOutputStream out = new ObjectOutputStream(file);
		MarksheetBean m= new MarksheetBean();
		m.setName("Heera");
		m.setTemp(4);
		out.writeObject(m);
		
		
		//deserialise object
	FileInputStream file1 = new FileInputStream("obj.ser");
	ObjectInputStream in = new ObjectInputStream(file1);
	 MarksheetBean m1= (MarksheetBean) in.readObject();
	 System.out.println(m1.getName());
	 System.out.println(m1.getTemp());// transient are ignored in serialisation
	 
out.close();
in.close();
file.close();
file1.close();
		
	}

}
