import java.util.ArrayList;

public class Booking {

	ArrayList<Ticket> tixList = new ArrayList<Ticket>();
	
	public Ticket createTix(String type, int price) {
		Ticket ticket = new Ticket(type, price);
		return ticket;
		
	}
	
	public void generateTix() {
		addTix(1, createTix("Standard", 8));
		addTix(2, createTix("OAP", 6));
		addTix(3, createTix("Student",6));
		addTix(4, createTix("Child",4 ));
		
	}
	public void addTix(Integer x, Ticket t) {
		tixList.add(x, t);
	}
	public Ticket getTix(Integer x) {
		return tixList.get(x);
	}
	
	public int countStudents(String student) {
		
		int count = 0;
		for (int i =1; i <=tixList.size(); i++) {
			if (tixList.get(i).getType().equalsIgnoreCase(student)) {
				count++;
			}
		}
		return count;
	}
}
