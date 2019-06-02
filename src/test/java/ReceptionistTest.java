import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReceptionistTest {
	Staff staff = new Staff();

	@Test
	public void canCreateReceptionist() {
		Receptionist eddie = new Receptionist("eddie", staff.getId());
		staff.addEmployee(eddie);
		assertEquals(1, eddie.getIdNum());
	}
	@Test
	public void canGetReceptionistSalary() {
		Receptionist eddie = new Receptionist("eddie", staff.getId());
		int receptionistSalary = eddie.getSalary();
		assertEquals(45000, receptionistSalary);
	}
	@Test
	public void canSeeThatReceptionistHasBeenPaid() {
		Receptionist eddie = new Receptionist("eddie", staff.getId());
		eddie.pay();
		boolean isPaid = eddie.isPaid();
		assertEquals(isPaid, true);
	}
	@Test
	public void canGetIdNumber() {
		Receptionist eddie = new Receptionist("eddie", staff.getId());
		staff.addEmployee(eddie);

		assertEquals(1, eddie.getIdNum());
	}
	@Test
	public void canSeeThatReceptionistIsOnPhone() {
		Receptionist eddie = new Receptionist("eddie", staff.getId());
		staff.addEmployee(eddie);
		eddie.setCall(true);
		assertEquals(true, eddie.isOnCall);
		
	}
}
