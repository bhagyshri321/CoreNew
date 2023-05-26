package in.Test.Inheritance;

public class Account {
	private String number;
	private String type;
	private double balance;
	
	
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public double deposit(double amount){
	return	balance= balance+amount;
	}
	
	public  double withdraw(double amount) {
		
		if(getBalance()-amount<500) {
			BalanceException e= new BalanceException();
			try {
				throw e;
			}catch(BalanceException e1){
				System.out.println(e.getMessage());}
			
		}else{return	amount= getBalance()- amount;}
		
		return 0;
		

				
			
		
	
	
	
	}
	
	
	
	public double getBalance() {
		return balance;
	}
		
		
	
	
	
	
	public static void main(String[] args) {
		
		Account a= new Account();
		a.setNumber("34634652");
		a.setType("saving");
		a.deposit(1000);
	System.out.println(a.getBalance());
	System.out.println(a.withdraw(600));
	
		
	}

}
