
import java.util.HashMap;
import java.util.Map;

public class PatientRegistry {
	protected int removedPatients = 0;
	Map<String, Patient> patients = new HashMap<String, Patient>();

	public int getId() {
		return patients.size() + 1;
	}

	public void addPatient(Patient pat) {
		patients.put("" + pat.getIdNum(), pat);
	}

	public void removePatient(String id) {
		patients.remove(id);
	}

	public void printTable() {
		System.out.println("\nPATIENTS");
		System.out.printf("%-8s %-20s %-20s %-15s %-15s \n", "ID Num|", "Health Level|", "Blood Level|", "Nurse ID|",
				"Nurse Name|");
		for (Patient pat : patients.values())
			System.out.printf("%-8d %-20d %-20d %-15d %-15s \n", pat.getIdNum(), pat.getHEALTH_LEVEL(),
					pat.getBLOOD_LEVEL(), pat.getAssignedNurseId(), pat.getAssignedNurseName());
	}

	public Patient getPatient(String id) {
		return patients.get(id);
	}

	public void tickAll() {
		for (Patient pat : patients.values()) {
			pat.tick();
			if (pat.getDischarge())
				removePatient("" + pat.getIdNum());
		}
	}

}
