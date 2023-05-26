package in.tstatic.synchronisation;

public class MyThread1  extends Thread{
	BookSeat b;  int seats;
	
	public MyThread1(BookSeat b, int seats) {
		this.b= b;
		this.seats= seats;
		
	}
	
	public void run() {
		b.bookSeats(seats);
	}
	
	class MyThread2 extends Thread{
		BookSeat b;  int seats;
		
		public MyThread2(BookSeat b, int seats) {
			this.b= b;
			this.seats= seats;
			
		}
		
		public void run() {
			b.bookSeats(seats);
		}
		
	}

}
