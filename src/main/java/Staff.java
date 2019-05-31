
import java.util.HashMap;
import java.util.Map;

public class Staff {
	Map<String, Employee> staff = new HashMap<String, Employee>();

	public int getId() {
		return staff.size() + 1;
	}

	public void addEmployee(Employee name) {
		staff.put(""+name.getIdNum(), name);
		
	}

}
