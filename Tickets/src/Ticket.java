
public class Ticket {
	
private int price = 0;
private boolean isItWednesday = false;

public  Ticket(TicketType tixType, boolean isItWednesday) {
price = tixType.getCost();

if (isItWednesday)
	price -=2;
}
public int getPrice() {
	return price;
}

public boolean isItWednesday() {
	return isItWednesday;
}


}
	

