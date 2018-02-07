import static org.junit.Assert.*;

import org.junit.Test;

public class TestTickets {
Booking booking = new Booking();
	@Test
	
	public void checkStandardTicketPrices() {
		int expectedPrice = 8;
		Ticket standardT = booking.tixList.get(1);
		assertEquals(expectedPrice, standardT);
		
	}
	@Test
	public void checkOapTicketPrices() {
		int expectedPrice = 6;
		Ticket oapT = booking.tixList.get(2);
		assertEquals(expectedPrice, oapT);
	}
	@Test
	public void checkStudentTicketPrices() {
		int expectedPrice = 6;
		Ticket studentT = booking.tixList.get(3);
		assertEquals(expectedPrice, studentT);
	}
	@Test
	public void checkChildTicketPrices() {
		int expectedPrice = 4;
		Ticket childT = booking.tixList.get(4);
		assertEquals(expectedPrice, childT);
	}

}
