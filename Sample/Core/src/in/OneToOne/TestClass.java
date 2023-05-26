package in.OneToOne;

public class TestClass {
	
	public static void main(String[] args) {
		
		Address a = new Address("Indore", "M.P.");
		Employee e= new Employee(1,"Bhagyhshri",a);
		
		System.out.println(e.id+" "+e.name+" "+e.add.city+" "+e.add.state);
	}

}
