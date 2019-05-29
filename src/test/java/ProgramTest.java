
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ProgramTest {
	Staff staff = new Staff();
	PatientRegistry reg = new PatientRegistry();
	

	 @Test
	 public void canCreateDoctor() {
		 Doctor fred = new Doctor("Heart surgery");
		 assertEquals("Heart surgery", fred.getSpecialty());
	 }
	 @Test
	 public void canCreateNurseAndGetIdNumber() {
		 Nurse freddie = new Nurse("Freddie", staff.getId());
		 staff.addEmployee(freddie);
		 
		 assertEquals(1, freddie.getIdNum());
	 }
	 @Test
	 public void canCreateTwoNursesAndGetIdNumberOf2() {
		 Nurse freddie = new Nurse("Freddie", staff.getId());
		 staff.addEmployee(freddie);
		 Nurse suzie = new Nurse("Suzie", staff.getId());
		 staff.addEmployee(suzie);
		 assertEquals(2, suzie.getIdNum());
	 }
	 @Test
	 public void canGetNurseSalary() {
		 Nurse freddie = new Nurse("Freddie", staff.getId());
		 int nurseSalary = freddie.getSalary();
		 assertEquals(50000, nurseSalary);
	 }
	 @Test
	 public void canSeeThatNurseHasNotBeenPaid() {
		 Nurse freddie = new Nurse("Freddie", staff.getId());
		 boolean isPaid = freddie.isPaid();
		 assertEquals(isPaid, false);
	 }
	 @Test
	 public void canSeeThatNurseHasBeenPaid() {
		 Nurse freddie = new Nurse("Freddie", staff.getId());
		 freddie.pay();
		 boolean isPaid = freddie.isPaid();
		 assertEquals(isPaid, true);
	 }
	 @Test
	 public void canAddOnePatientToNurse() {
		 Nurse freddie = new Nurse("Freddie", staff.getId());
		 Patient jim = new Patient(reg.getId());
		 freddie.addPatient(jim);
		 int numPatients = freddie.getNumPatients();
		 assertEquals(1, numPatients);
	 }
	 @Test
	 public void canAddTwoPatientsToNurse() {
		 Nurse freddie = new Nurse("Freddie", staff.getId());
		 Patient jim = new Patient(reg.getId());
		 reg.addPatient(jim);
		 freddie.addPatient(jim);
		 Patient robert = new Patient(reg.getId());
		 reg.addPatient(robert);
		 freddie.addPatient(robert);
		 int numPatients = freddie.getNumPatients();
		 assertEquals(2, numPatients);
	 }
}
