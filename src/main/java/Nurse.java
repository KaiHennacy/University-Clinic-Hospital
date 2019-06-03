import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Nurse extends Medical {

	Map<String, Patient> patients = new HashMap<String, Patient>();
	final int SALARY = 50000;

	public int getNumPatients() {
		return patients.size();
	}

	public void drawBlood(Patient pat) {
		pat.subtractBloodLevel(1);
	}

	public void careFor(Patient pat) {
		pat.addHealth(1);
	}

	public Nurse(String nurseName, int id) {
		setName(nurseName);
		setIdNum(id);
		setSalary(SALARY);
	}

	public void addPatient(Patient pat) {
		patients.put("" + pat.getIdNum(), pat);
		pat.setAssignedNurse(getName(), getIdNum());
	}

	public void removePatient(String id) {
		patients.remove(id);
	}

	public void resetAllPatients() {
		for (Patient pat : patients.values()) {
			pat.setAssignedNurse("", 0);
			patients.remove("" + pat.getIdNum());
		}

	}

	@Override
	public void tick() {
		Random random = new Random();

		for (Patient pat : patients.values()) {
			boolean sick = random.nextBoolean();
			if (!sick && pat.getHEALTH_LEVEL() >= 20) {
				removePatient("" + pat.getIdNum());
				pat.setToBeDischarged();
			}
		}
	}

}
