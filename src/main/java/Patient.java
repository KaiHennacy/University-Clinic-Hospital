
public class Patient extends Program{
	private int BLOOD_LEVEL = 20;
	private int HEALTH_LEVEL = 10;

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


}
