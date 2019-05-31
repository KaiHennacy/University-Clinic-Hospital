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
}
