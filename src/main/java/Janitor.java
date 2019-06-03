import java.util.Random;

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
	@Override
	public void tick() {
		Random random = new Random();
		boolean switchStatus = random.nextBoolean();
		if(isSweeping()&&switchStatus) {
			setSweeping(false);
		}
		else if(!isSweeping()&&switchStatus) {
			setSweeping(true);
		}
		
	}

}