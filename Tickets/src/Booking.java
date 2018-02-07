
import java.util.ArrayList;



public class Booking {

	ArrayList<Ticket> tixList = new ArrayList<Ticket>();
	
	
public void bookingAdd(Ticket TT) {
	tixList.add(TT);
}


public int calculatingCost() {
	return tixList.stream().mapToInt(Ticket -> Ticket.getPrice()).sum();
}
}




