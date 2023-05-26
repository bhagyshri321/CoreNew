 package in.PDeepCloning;

public class Test {
	 public static void main(String[] args) throws CloneNotSupportedException {
		
		 Customer c= new Customer("Ram");
	 Customer c1= (Customer)c.clone();
	 c1.name= "Balram";
	 c1.account.balance= 20;
	 
	 System.out.println("Original Object");
	 System.out.println("Name "+ c.name);
	 System.out.println("Balance"+ c.account.balance);
	 
	 System.out.println("cloned Object");
	 System.out.println("Name"+ c1.name);
	 System.out.println("Balance"+ c1.account.balance);
	}

}
