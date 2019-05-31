import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DoctorTest {
	Staff staff = new Staff();
	PatientRegistry reg = new PatientRegistry();

	@Test
	public void canCreateDoctor() {
		Doctor fred = new Doctor("fred", staff.getId(), "Heart Surgery");
		staff.addEmployee(fred);
		assertEquals("Heart Surgery", fred.getSpecialty());

	}

	@Test
	public void canDrawBloodFromPatient() {
		Doctor freddie = new Doctor("Freddie", staff.getId(), "Heart Surgery");
		staff.addEmployee(freddie);
		Patient jim = new Patient(reg.getId());
		freddie.drawBlood(jim);
		assertEquals(18, jim.getBLOOD_LEVEL());

	}

	@Test
	public void canCareForPatient() {
		Doctor freddie = new Doctor("Freddie", staff.getId(), "Heart Surgery");
		staff.addEmployee(freddie);
		Patient jim = new Patient(reg.getId());
		reg.addPatient(jim);
		freddie.careFor(jim);
		assertEquals(12, jim.getHEALTH_LEVEL());

	}
	@Test
	public void canGetDoctorSalary() {
		Doctor freddie = new Doctor("freddie", staff.getId(), "Heart Surgery");
		int doctorSalary = freddie.getSalary();
		assertEquals(90000, doctorSalary);
	}

	@Test
	public void canSeeThatDoctorHasNotBeenPaid() {
		Doctor freddie = new Doctor("Freddie", staff.getId(), "Heart Surgery");
		boolean isPaid = freddie.isPaid();
		assertEquals(isPaid, false);
	}

	@Test
	public void canSeeThatDoctorHasBeenPaid() {
		Doctor freddie = new Doctor("Freddie", staff.getId(), "Heart Surgery");
		freddie.pay();
		boolean isPaid = freddie.isPaid();
		assertEquals(isPaid, true);
	}
}
