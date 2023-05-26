package co.hashAndEquals;

public class BookSeatsApp  {
	
	 int t_seats= 10;
	 
	synchronized void bookseats(int seats) {
		 if(t_seats>=seats) {
			 System.out.println("seats booked successfully");
			 t_seats= t_seats-seats;
			 System.out.println("seats left"+ t_seats);
		 }
		 
		 else {
			 System.out.println("seats cannot be booked");
			 System.out.println("seats left"+ t_seats);
		 }
	 }
	
	
}
