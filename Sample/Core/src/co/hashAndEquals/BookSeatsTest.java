package co.hashAndEquals;

public class BookSeatsTest  extends Thread{
	
	static BookSeatsApp b;
	int seats;
	 @Override
	public void run() {
		
		b.bookseats(seats);
	}
	 
	 public static void main(String[] args) {
		
		 b= new BookSeatsApp();
		 
		 BookSeatsTest deepak= new BookSeatsTest();
				 deepak.seats= 8;
		 BookSeatsTest hina = new BookSeatsTest();
		 hina.seats= 5;
		 
		 deepak.start();
		 hina.start();
	}
	
	
	

}
