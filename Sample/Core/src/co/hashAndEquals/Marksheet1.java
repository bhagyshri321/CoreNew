package co.hashAndEquals;

public class Marksheet1 {
	
	public String name;
	public String  rollno;
	public int marks;
	

public Marksheet1 (String n,String r, int m) {
	
	name= n;
	rollno= r;
	marks= m;}

@Override
public boolean equals(Object o) {
	if(o==null) {
		return false;
	}
	if(!(o instanceof Marksheet1)) {
		return false;
	}
	Marksheet1 m=  (Marksheet1) o;
	return rollno.equals(m.rollno);
}

@Override
public int hashCode() {
	
	return rollno.hashCode();
}
	
	
	
	
}



