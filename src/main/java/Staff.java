
import java.util.HashMap;
import java.util.Map;

public class Staff {
	Map<String, Employee> staff = new HashMap<String, Employee>();
	
	protected int fireCount = 0;

	public int getId() {
		return staff.size() + 1 + fireCount;
	}

	public void addEmployee(Employee name) {
		staff.put(""+name.getIdNum(), name);
		
	}

	public void printDoctorTable() {
		System.out.println("DOCTORS:");
		System.out.printf("%-8s %-20s %-20s %-6s %-6s \n", "ID Num|", "Name|", "Specialty|", "Salary|", "Paid?|");
		for(Employee emp : staff.values()) {
			if(emp instanceof Doctor)
				System.out.printf("%-8d %-20s %-20s %-6d %-6b \n", emp.getIdNum(),emp.getName(), ((Doctor) emp).getSpecialty(), emp.getSalary(), emp.isPaid());
		}
		
	}
	public void printNurseTable() {
		System.out.println("NURSES:");
		System.out.printf("%-8s %-20s %-20s %-6s %-6s \n", "ID Num|", "Name|", "Num Of Patients|", "Salary|", "Paid?|");
		for(Employee emp : staff.values()) {
			if(emp instanceof Nurse)
				System.out.printf("%-8d %-20s %-20d %-6d %-6b \n", emp.getIdNum(),emp.getName(), ((Nurse) emp).getNumPatients(), emp.getSalary(), emp.isPaid());
		}
	}
	public void printJanitorTable() {
		System.out.println("JANITORS:");
		System.out.printf("%-8s %-20s %-20s %-6s %-6s \n", "ID Num|", "Name|", "Sweeping?|", "Salary|", "Paid?|");
		for(Employee emp : staff.values()) {
			if(emp instanceof Janitor)
				System.out.printf("%-8d %-20s %-20b %-6d %-6b \n", emp.getIdNum(), emp.getName(), ((Janitor) emp).isSweeping(), emp.getSalary(), emp.isPaid());
		}
	}
	public void printReceptionistTable() {
		System.out.println("RECEPTIONISTS:");
		System.out.printf("%-8s %-20s %-20s %-6s %-6s \n", "ID Num|", "Name|", "On Call?|", "Salary|", "Paid?|");
		for(Employee emp : staff.values()) {
			if(emp instanceof Receptionist)
				System.out.printf("%-8d %-20s %-20b %-6d %-6b \n", emp.getIdNum(),emp.getName(), ((Receptionist) emp).isOnCall(), emp.getSalary(), emp.isPaid());
		}
	}
	public String getEmployeeType(String name) {
		if(staff.get(name) instanceof Doctor) 
			return "doctor";
		if(staff.get(name) instanceof Nurse) 
			return "nurse";
		if(staff.get(name) instanceof Janitor) 
			return "janitor";
		if(staff.get(name) instanceof Receptionist) 
			return "receptionist";
		return "invalid";
	}
	public Doctor getDoctor(String id) {
		return (Doctor)staff.get(id);
	}

	public Nurse getNurse(String id) {
		return (Nurse)staff.get(id);
	}
	public Janitor getJanitor(String id) {
		return (Janitor)staff.get(id);
	}
	public Receptionist getReceptionist(String id) {
		return (Receptionist)staff.get(id);
	}

	public void fire(String id) {
		staff.remove(id);
		fireCount+=1;
	}
	public void tickAll() {
		for(Employee emp : staff.values()) {
			emp.tick();
		}
	}

	

}
