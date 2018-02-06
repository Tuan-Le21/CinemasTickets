import static org.junit.Assert.*;

import org.junit.Test;

public class TestTickets {
Booking booking = new Booking();
	@Test
	
	public void checkStandardTicketPrices() {
		int expectedPrice = 8;
		int standardT = booking.getTix(x)
		assertEquals(expectedPrice, standardT);
		
	}
	@Test
	public void checkOapTicketPrices() {
		int expectedPrice = 6;
		int oapT = ticket.getOap();
		assertEquals(expectedPrice, oapT);
	}
	@Test
	public void checkStudentTicketPrices() {
		int expectedPrice = 6;
		int studentT = ticket.getStudent();
		assertEquals(expectedPrice, studentT);
	}
	@Test
	public void checkChildTicketPrices() {
		int expectedPrice = 4;
		int childT = ticket.getChild();
		assertEquals(expectedPrice, childT);
	}

}
