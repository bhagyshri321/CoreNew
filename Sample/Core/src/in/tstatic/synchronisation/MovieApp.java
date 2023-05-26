package in.tstatic.synchronisation;

public class MovieApp {
	
	public static void main(String[]args) {
		BookSeat b1 = new BookSeat();
		MyThread1 t1  = new MyThread1(b1, 9);
	t1.start();
	
	MyThread1 t2  = new MyThread1(b1, 6);
	t2.start();
	
	BookSeat b2 = new BookSeat();
	MyThread1 t3  = new MyThread1(b2, 9);
t3.start();

MyThread1 t4  = new MyThread1(b2, 6);
t4.start();
	}
	


}
