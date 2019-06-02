import java.util.HashMap;
import java.util.Map;

public class Nurse extends Medical{

	
	Map<String, Patient> patients = new HashMap <String, Patient>();
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
		patients.put(""+pat.getIdNum(), pat);
		pat.setAssignedNurse(getName(), getIdNum());
	}
	public void removePatient(String id) {
		patients.remove(id);
	}
	public void resetAllPatients() {
		for(Patient pat : patients.values()) {
			pat.setAssignedNurse("", 0);
			patients.remove(""+ pat.getIdNum());
		}
		
	}

}
