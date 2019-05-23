
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ProgramTest {

	 @Test
	 public void canCreateDoctor() {
		 Doctor fred = new Doctor("Heart surgery");
		 assertEquals("Heart surgery", fred.getSpecialty());
	 }
	 @Test
	 public void canCreateNurse() {
		 Nurse freddie = new Nurse(3);
		 assertEquals(3, freddie.getNumPatients());
	 }
}
