package in.co.PolyTest;

public class Test {
	
	public static void main(String[] args) {
		
	
	
	Bank[] t= new Bank[2];
	t[0]= new AxisBank();
	t[1]= new SBI();
	
	loanEn(t);
	
	
	}

	private static int loanEn(Bank[] t) {
		
		int y=0;
		/*for(Bank r:t) {
			System.out.println(r.intrate()+" "+r.name());*/
			for(int i=0; i<t.length;i++) {
				y=y+t[i].intrate();
				
			}
			
			
			
			
			
		
		System.out.println(y);
		return y;
		
	}

}
