package in.co.Constructoroverloading;

public class Person {
	
	int id;
	String name;
	String lname;
	
	public Person() {
		System.out.println("IN parent");
	}
	 public Person(int i, String n) {
		 id= i;
		 name= n;
	 }
	 
	 Person( String n, String l, int i)
	 {
		 this(i,n);
		 lname= l;
		 
	 }	
	 
	 public static void main(String[] args) {
		 Person p = new Person("Ria","Gandhi",5);
		 System.out.println(p.id);
		 System.out.println(p.name+" "+ p.lname);
		
	}
	
	
}
