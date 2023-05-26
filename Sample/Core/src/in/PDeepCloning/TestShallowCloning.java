package in.PDeepCloning;

public class TestShallowCloning {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		BankAccount b= new BankAccount(10);
		BankAccount b2= (BankAccount) b.clone();
		b2.balance=20;
		System.out.println(b.balance);
		System.out.println(b2.balance);

		
	}

}
