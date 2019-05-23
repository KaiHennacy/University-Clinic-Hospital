
public abstract class Employee extends Program{
	
	protected int salary;
	protected String name;
	protected int idNum;
	protected boolean hasBeenPaid;
	public int getSalary() {
		return salary;
	}
	public String getName() {
		return name;
	}
	public int getIdNum() {
		return idNum;
	}
	public boolean isHasBeenPaid() {
		return hasBeenPaid;
	}
	
	public abstract void pay(int amountToPay);

}
