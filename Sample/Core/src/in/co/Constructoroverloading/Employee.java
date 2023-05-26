package in.co.Constructoroverloading;

public class Employee  extends Person {
	
	int salary;
	
public Employee() {
	super();
	System.out.println("in child");
}

 public Employee(String a,  String b, int k,int g) {
	 super(g,b);
	 salary= k;
	 
 }
 
 public static void main(String[] args) {
	 
	 Employee e= new Employee("Ram","Ria",4, 45);
	 Employee e2= new Employee();
	 System.out.println(e.id+" "+e.name+" "+e.lname+" "+e.salary);
	 
	
}
	
	
	
	
	

}
