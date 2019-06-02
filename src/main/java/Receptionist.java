public class Receptionist extends Employee{
	
	public Receptionist(String name, int id) {
		setName(name);
		setIdNum(id);
		setSalary(SALARY);
	}
	final int SALARY = 45000;
	protected boolean isOnCall;
	
	public boolean isOnCall() {
		return isOnCall = false;
	}
	
	public void setCall(boolean onCall) {
	isOnCall = onCall;
	}
	
	
	

}
