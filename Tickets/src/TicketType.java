
public enum TicketType {
STANDARD(8), OAP(6), STUDENT(6), CHILD(4);
	
	private int cost;
	private TicketType(int cost) {
		this.cost = cost;
	}
	public int getCost() {
		return cost;
	}
}
