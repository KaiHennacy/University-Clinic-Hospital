import java.util.Random;

public class Receptionist extends Employee {

	public Receptionist(String name, int id) {
		setName(name);
		setIdNum(id);
		setSalary(SALARY);
	}

	final int SALARY = 45000;
	protected boolean isOnCall = false;

	public boolean isOnCall() {
		return isOnCall;
	}

	public void setCall(boolean onCall) {
		isOnCall = onCall;
	}

	@Override
	public void tick() {
		Random random = new Random();
		boolean switchStatus = random.nextBoolean();
		if(isOnCall()&&switchStatus) {
			setCall(false);
		}
		else if(!isOnCall()&&switchStatus) {
			setCall(true);
		}
		
	}

}
