import static org.junit.Assert.*;

import org.junit.Test;

public class TestTickets {
Ticket ticket = new Ticket(8,6,6,4);
	@Test
	
	public void checkStandardTicketPrices() {
		int expectedPrice = 8;
		int standardT = ticket.getStandard();
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
