

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JanitorTest {
	Staff staff = new Staff();

	@Test
	public void canCreateJanitorAndGetIdNumberOf1() {
		Janitor ed = new Janitor("ed", staff.getId());
		staff.addEmployee(ed);

		assertEquals(1, ed.getIdNum());
	}
	@Test
	public void canCreate2JanitorsAndGetIdNumberOf2() {
		Janitor ed = new Janitor("ed", staff.getId());
		staff.addEmployee(ed);
		Janitor edison = new Janitor("edison", staff.getId());
		staff.addEmployee(ed);

		assertEquals(2, edison.getIdNum());
	}
	@Test
	public void canTellJanitorsToSweepAndCheckIfTheyAreSweeping() {
		Janitor ed = new Janitor("ed", staff.getId());
		staff.addEmployee(ed);
		Janitor edison = new Janitor("edison", staff.getId());
		staff.addEmployee(ed);
		edison.setSweeping(true);

		assertEquals(false, ed.isSweeping());
		assertEquals(true, edison.isSweeping());
	}
	@Test
	public void canGetJanitorSalary() {
		Janitor ed = new Janitor("ed", staff.getId());
		staff.addEmployee(ed);
		int salary = ed.getSalary();

		assertEquals(40000, salary);
	}
	@Test
	public void canSeeIfJanitorHasBeenPaid() {
		Janitor ed = new Janitor("ed", staff.getId());
		staff.addEmployee(ed);
		boolean hasBeenPaid = ed.isPaid();
		assertEquals(false, hasBeenPaid);
		ed.pay();
		hasBeenPaid = ed.isPaid();

		assertEquals(true, hasBeenPaid);
	}
	
	
}
