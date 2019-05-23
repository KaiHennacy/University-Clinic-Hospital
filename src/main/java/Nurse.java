
public class Nurse extends Medical{

	private int numPatients;
	private int salary = 50000;
	
	public int getNumPatients() {
		return numPatients;
	}
	public void setNumPatients(int numPatients) {
		this.numPatients = numPatients;
	}
	public void drawBlood(Patient pat) {
		pat.subtractBloodLevel(1);
	}
	public void careFor(Patient pat) {
		pat.addHealth(1);
	}
	public Nurse(int numberOfPatients) {
		setNumPatients(numberOfPatients);

	}
	@Override
	public void pay(int amountToPay) {
		// TODO Auto-generated method stub
		
	}

}
