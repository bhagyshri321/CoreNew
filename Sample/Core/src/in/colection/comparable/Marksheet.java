package in.colection.comparable;

public class Marksheet   {
	
	// generic me marksheet pass karna jaruri hai
	private String rollno;
	private String name;
	private int marks;
	public Marksheet(String r, String n, int m) {
		rollno=r;
		name= n;
		marks=m;
		}
	
	public int compareTo(Marksheet m) {
		
		return rollno.compareTo(m.rollno);
	}
	
	public String toString() {
		return rollno+","+name+","+marks;
		
	}
	
	
	
	
	/*public String rollNo;
	public String name;
	public int marks;
	
	public Marksheet(String r,String n,int j) {
		rollNo= r;
		name=n;
		marks=j;
		
	}
	@Override
	public int compareTo(Marksheet m) {
		
		return rollNo.compareTo(m.rollNo);
	}
public String toString() {
		return rollNo+","+name+","+marks;
		
	}*/}
