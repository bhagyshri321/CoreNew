package in.OneToOne;

public class Employee {
 	int id;
	String name;
	Address add;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	Employee(int i,String n,Address a){
		this.id= i;
		this.name= n;
		this.add= a;
	}

}
