package in.tstatic.synchronisation;

public class BookSeat {
	
	int total_seats =10;
	
	void bookSeats(int seats) {
		if(total_seats>=seats) {
			System.out.println("seats booked successfully");
			total_seats= total_seats-seats;
			System.out.println("seats left"+ total_seats);
		}
		else {
			System.out.println("seats cannot be booked");
			System.out.println("seats left"+ total_seats);
		} 
	}

}
