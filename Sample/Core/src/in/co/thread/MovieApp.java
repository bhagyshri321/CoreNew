package in.co.thread;

public class MovieApp extends Thread {
static 	BookSeat b;
int seats;
	public void run() {
		
		b.bookSeat(seats);
		
	}
	
	public static void main(String[]args) {
	b= new BookSeat(); 
	MovieApp jay = new MovieApp();
	jay.seats= 6;
	jay.start();
	MovieApp ajay = new MovieApp();
	ajay.seats=7;
	ajay.start();
		
	}

}
