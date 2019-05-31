public class Receptionist extends Employee{
	
	public Receptionist(String name, int id) {
		setName(name);
		setIdNum(id);
		setSalary(SALARY);
	}
	final int SALARY = 45000;
	private boolean isOnCall;
	
	

}
