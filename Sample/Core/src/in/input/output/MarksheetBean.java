package in.input.output;

import java.io.Serializable;

public class MarksheetBean implements Serializable{
	 
	private String name;
	transient int temp;
	
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
}



