import java.util.HashMap;

public class Main {

		 HashMap<Integer, Booking> bookingM = new HashMap<Integer, Booking>();
	public static void main(String[] args) {
	
		Booking booking = new Booking();
		

		System.out.println(booking.tixList);
	}
 public void addToBooking(int id, Booking book) {
		 	bookingM.put(id, book);
		 }

		 public Booking getBook(int id) {
		 	return bookingM.get(id);
		 }

}	
