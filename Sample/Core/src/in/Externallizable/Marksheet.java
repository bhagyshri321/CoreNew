package in.Externallizable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Marksheet implements Externalizable{
	
	private String name;
	private String lname;
	transient int temp;
	
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	public void setName(String n) {
		name= n;
	}
	public String getName() {
		return name;
	}
	
	public void setlname(String l) {
		lname= l;
	}
	
	public String getlname() {
		return lname;
	}
	
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject("Bhagyhsri");
		/* out.writeObject("Saxena"); */
		 out.writeInt(5); 
	}
	
	public void readExternal(ObjectInput in ) throws ClassNotFoundException, IOException {
	 name=	 (String) in.readObject();
		 temp= in.readInt(); 
		/* lname= (String) in.readObject(); */
	}
	
	
	
}
