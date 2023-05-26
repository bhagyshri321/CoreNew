package in.co.thread;

public class BookSeat {
	int total_seats=10;
 void bookSeat(int seats) {
	
	System.out.println(Thread.currentThread().getName());
	System.out.println(Thread.currentThread().getName());
	System.out.println(Thread.currentThread().getName());
	System.out.println(Thread.currentThread().getName());
	synchronized(this) {	
	if(total_seats>=seats) {
			System.out.println(seats+"seats booked successfully");
			total_seats = total_seats- seats;
			System.out.println("seats left" +total_seats);
		}
		else {
			System.out.println(seats+"seats cannot be booked");
			System.out.println("seats left" +total_seats);
		}
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
	}
	
 }
}
