
public class Doctor extends Medical {

	protected String specialty;
	final int SALARY = 90000;

	public Doctor(String name, int ID, String specialtyToSet) {
		setName(name);
		setIdNum(ID);
		setSpecialty(specialtyToSet);
		setSalary(SALARY);

	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialtyToSet) {
		specialty = specialtyToSet;
	}

	@Override
	public void drawBlood(Patient pat) {
		pat.subtractBloodLevel(2);

	}

	@Override
	public void careFor(Patient pat) {
		pat.addHealth(2);

	}

	@Override
	public void tick() {}

}
