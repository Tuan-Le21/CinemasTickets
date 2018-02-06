
public class Ticket {
	private int standard = 8;
	private int oap = 6;
	private int student = 6;
	private int child = 4;
	
	public Ticket(int standard, int oap, int student, int child) {
		super();
		this.standard = standard;
		this.oap = oap;
		this.student = student;
		this.child = child;
	}
	public int getStandard() {
		return standard;
	}
	public void setStandard(int standard) {
		this.standard = standard;
	}
	public int getOap() {
		return oap;
	}
	public void setOap(int oap) {
		this.oap = oap;
	}
	public int getStudent() {
		return student;
	}
	public void setStudent(int student) {
		this.student = student;
	}
	public int getChild() {
		return child;
	}
	public void setChild(int child) {
		this.child = child;
	}
	
	
}

