

import java.util.HashMap;
import java.util.Map;

public class PatientRegistry {
	protected int removedPatients = 0;
	Map<String, Patient> patients = new HashMap <String, Patient>();
	
	public int getId() {
		return patients.size() + 1;
	}
	
	public void addPatient(Patient pat) {
		patients.put(""+pat.getIdNum(), pat);
		
	}
}
