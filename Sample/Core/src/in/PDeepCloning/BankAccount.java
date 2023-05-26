package in.PDeepCloning;

public class BankAccount implements Cloneable {
	public double balance;
	
	public BankAccount(double b) {
		this.balance= b;
		// TODO Auto-generated constructor stub
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}


}
