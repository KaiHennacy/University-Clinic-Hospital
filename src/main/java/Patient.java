
public class Patient extends Program{
	
	protected int idNum;
	
	private int BLOOD_LEVEL = 20;
	private int HEALTH_LEVEL = 10;
	
	public Patient(int id) {
		setIdNum(id);
	}

	private void setIdNum(int id) {
		idNum = id;
	}

	public void subtractBloodLevel(int bloodDrawn) {
		BLOOD_LEVEL -= bloodDrawn;
		
	}

	public int getBLOOD_LEVEL() {
		return BLOOD_LEVEL;
	}

	public int getHEALTH_LEVEL() {
		return HEALTH_LEVEL;
	}

	public void addHealth(int healthAdded) {
		HEALTH_LEVEL += healthAdded; 
		
	}

	public int getIdNum() {
		return idNum;
	}


}
