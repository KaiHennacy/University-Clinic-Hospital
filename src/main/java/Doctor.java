
public class Doctor extends Medical{
	
	private String specialty;
	private int salary = 90000;
	
	public Doctor(String specialtyToSet) {
		setSpecialty(specialtyToSet);
	}
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialtyToSet) {
		specialty = specialtyToSet;
	}
	@Override
	public void pay(int amountToPay) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void drawBlood(Patient pat) {
		pat.subtractBloodLevel(2);
		
	}
	@Override
	public void careFor(Patient pat) {
		pat.addHealth(2);
		
	}

}
