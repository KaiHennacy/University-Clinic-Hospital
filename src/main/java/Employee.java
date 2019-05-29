

public abstract class Employee{
	
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
	public void setIdNum(int id) {
		idNum = id;
	}
	public void setName(String employeeName) {
		name = employeeName;
	}
	public void setSalary(int SALARY) {
		salary = SALARY;
	}
	public boolean isPaid() {
		return hasBeenPaid;
	}
	
	public void pay() {
		hasBeenPaid = true;
	}

}
