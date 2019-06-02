public class Janitor extends Employee{

	final int SALARY = 40000;
	protected boolean isSweeping = false;
	
	public Janitor(String name, int id) {
		setName(name);
		setIdNum(id);
		setSalary(SALARY);
	}
	public boolean isSweeping() {
		return isSweeping;
	}
	public void setSweeping(boolean sweep) {
		isSweeping = sweep;
	}

}
