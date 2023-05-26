package in.Test.Inheritance;

public class BusinessMan  implements Richman, SocialWorker {

	@Override
	public void helpOthers() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void earnmoney() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void donation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void party() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		BusinessMan b= new BusinessMan();
		b.donation();
		b.party();
		
		SocialWorker s= new BusinessMan();
		s.helpOthers();
		
		
	Richman r= new BusinessMan();
	r.donation();
	r.earnmoney();
	r.party();

		
		
	
	
	

}}
