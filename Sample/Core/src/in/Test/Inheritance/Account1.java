package in.Test.Inheritance;

public class Account1 {
	
	private String number;
	private String acctype;
	private double balance;
	
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAcctype() {
		return acctype;
	}
	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}
	
	public double deposit(double amount) {
		return balance = balance+amount;
		
	}
	
	public double withdraw(double amount) {
		
		if(balance-amount<500) {
			BalanceException b= new BalanceException();
			try {
				throw b;
				
			}catch(BalanceException e1) {
				System.out.println(e1.getMessage());
			}
		}else {return balance= balance-amount;}
		return  0;
		
		
	}
	
	public double getBalance() {
		return balance;
	
		
	}
	
	
		
		
	
	
	public static void main(String[] args) {
		
		Account1 b = new Account1();
		
		  System.out.println(b.deposit(400.0));
		  System.out.println(b.withdraw(300));
		 
		System.out.println(b.getBalance());
		
		System.out.println(b.deposit(500));
	}

}
