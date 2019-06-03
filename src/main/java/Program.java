import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Staff staff = new Staff();
		PatientRegistry reg = new PatientRegistry();

		String userInput = "";

		boolean exit = false;

		// Pre-constructed employees/patients
		Doctor fred = new Doctor("Fred", staff.getId(), "Heart Surgery");
		staff.addEmployee(fred);
		Doctor steve = new Doctor("Steve", staff.getId(), "Kidney Transplant");
		staff.addEmployee(steve);
		Doctor martha = new Doctor("Martha", staff.getId(), "Brain Surgery");
		staff.addEmployee(martha);

		Nurse susan = new Nurse("Susan", staff.getId());
		staff.addEmployee(susan);
		Nurse jack = new Nurse("Jack", staff.getId());
		staff.addEmployee(jack);

		Janitor ed = new Janitor("Ed", staff.getId());
		staff.addEmployee(ed);
		Janitor chloe = new Janitor("Chloe", staff.getId());
		staff.addEmployee(chloe);

		Receptionist eddie = new Receptionist("Eddie", staff.getId());
		staff.addEmployee(eddie);
		Receptionist fresca = new Receptionist("Fresca", staff.getId());
		staff.addEmployee(fresca);

		Patient jim = new Patient(reg.getId());
		reg.addPatient(jim);

		Patient tim = new Patient(reg.getId());
		reg.addPatient(tim);

		Patient slim = new Patient(reg.getId());
		reg.addPatient(slim);

		Patient zim = new Patient(reg.getId());
		reg.addPatient(zim);
		// pre-constructed employees/patients

		System.out.println("Welcome");

		do {
			staff.printDoctorTable();
			staff.printNurseTable();
			staff.printJanitorTable();
			staff.printReceptionistTable();
			reg.printTable();

			System.out.println("Press 1 to select an employee");
			System.out.println("Press 2 to add an employee");
			System.out.println("Press 3 add a patient");
			System.out.println("Press 4 to exit");

			userInput = in.nextLine();

			switch (userInput) {

			case "1":
				staff.printDoctorTable();
				staff.printNurseTable();
				staff.printJanitorTable();
				staff.printReceptionistTable();

				System.out.println("Enter the ID of the employee to be selected: \n");
				userInput = in.nextLine();
				String idHolder = userInput;
				switch (staff.getEmployeeType(idHolder)) {
				case "doctor":
					System.out.println("You've selected a doctor");
					System.out.println("Press 1 to tell this doctor to care for a patient");
					System.out.println("Press 2 to tell this doctor to draw blood from a patient");
					System.out.println("Press 3 to pay this doctor");
					System.out.println("Press 4 to fire this doctor");
					System.out.println("Press 5 to exit");
					userInput = in.nextLine();
					switch (userInput) {
					case "1":
						reg.printTable();
						System.out.println("Enter the ID number of the patient you would like to care for:");
						userInput = in.nextLine();
						staff.getDoctor(idHolder).careFor(reg.getPatient(userInput));
						System.out.println("Patient number " + userInput + "'s health level is now "
								+ reg.getPatient(userInput).getHEALTH_LEVEL());
						break;
					case "2":
						reg.printTable();
						System.out.println("Enter the ID number of the patient you would like to draw blood from:");
						userInput = in.nextLine();
						staff.getDoctor(idHolder).drawBlood(reg.getPatient(userInput));
						System.out.println("Patient number " + userInput + "'s blood level is now "
								+ reg.getPatient(userInput).getBLOOD_LEVEL());
						break;
					case "3":
						staff.getDoctor(idHolder).pay();
						break;
					case "4":
						staff.fire(idHolder);
						staff.printDoctorTable();
						break;
					case "5":
						exit = true;
						break;
					}
					break;
				case "nurse":
					System.out.println("You've selected a nurse");
					System.out.println("Press 1 to tell this nurse to care for a patient");
					System.out.println("Press 2 to tell this nurse to draw blood from a patient");
					System.out.println("Press 3 to add a patient to this nurse");
					System.out.println("Press 4 to discharge a patient");
					System.out.println("Press 5 to pay this nurse");
					System.out.println("Press 6 to fire this nurse");
					System.out.println("Press 7 to exit");
					userInput = in.nextLine();
					switch (userInput) {

					case "1":
						reg.printTable();
						System.out.println("Enter the ID number of the patient you would like to care for:");
						userInput = in.nextLine();
						staff.getNurse(idHolder).careFor(reg.getPatient(userInput));
						System.out.println("Patient number " + userInput + "'s health level is now "
								+ reg.getPatient(userInput).getHEALTH_LEVEL());
						break;
					case "2":
						reg.printTable();
						System.out.println("Enter the ID number of the patient you would like to draw blood from:");
						userInput = in.nextLine();
						staff.getNurse(idHolder).drawBlood(reg.getPatient(userInput));
						System.out.println("Patient number " + userInput + "'s blood level is now "
								+ reg.getPatient(userInput).getBLOOD_LEVEL());
						break;
					case "3":
						reg.printTable();
						System.out.println("Enter the ID number of the patient you would like to add to this nurse:");
						userInput = in.nextLine();
						if (reg.getPatient(userInput).getAssignedNurseId() != 0) {
							staff.getNurse("" + reg.getPatient(userInput).getAssignedNurseId())
									.removePatient(userInput);
						}
						staff.getNurse(idHolder).addPatient(reg.getPatient(userInput));
						System.out.println(staff.getNurse(idHolder).getName() + " now has "
								+ staff.getNurse(idHolder).getNumPatients() + " patient(s).");
						break;
					case "4":
						reg.printTable();
						System.out.println("Enter the ID number of the patient you would like discharge:");
						userInput = in.nextLine();
						staff.getNurse(idHolder).removePatient(userInput);
						reg.removePatient(userInput);
						reg.printTable();
						break;
					case "5":
						staff.getNurse(idHolder).pay();
						break;
					case "6":
						staff.getNurse(idHolder).resetAllPatients();
						staff.fire(idHolder);

						break;
					case "7":
						exit = true;
						break;
					}
					break;
				case "janitor":
					System.out.println("You've selected a janitor");
					System.out.println("Press 1 to tell this janitor to start sweeping");
					System.out.println("Press 2 to tell this janitor to stop sweeping");
					System.out.println("Press 3 to pay this janitor");
					System.out.println("Press 4 to fire this janitor");
					System.out.println("Press 5 to exit");

					userInput = in.nextLine();
					switch (userInput) {
					case "1":
						staff.getJanitor(idHolder).setSweeping(true);
						System.out.println(staff.getJanitor(idHolder).getName() + " has begun sweeping.");
						break;
					case "2":
						staff.getJanitor(idHolder).setSweeping(false);
						System.out.println(staff.getJanitor(idHolder).getName() + " has stopped sweeping.");
						break;
					case "3":
						staff.getJanitor(idHolder).pay();
						break;
					case "4":
						staff.fire(idHolder);
						break;
					case "5":
						exit = true;
						break;
					}
					break;
				case "receptionist":
					System.out.println("You've selected a receptionist");
					System.out.println("Press 1 to tell this receptionist to begin a call");
					System.out.println("Press 2 to tell this receptionist to ended a call");
					System.out.println("Press 3 to pay this receptionist");
					System.out.println("Press 4 to fire this receptionist");
					System.out.println("Press 5 to exit");

					userInput = in.nextLine();
					switch (userInput) {
					case "1":
						staff.getReceptionist(idHolder).setCall(true);
						System.out.println(staff.getReceptionist(idHolder).getName() + " has begun a call.");
						break;
					case "2":
						staff.getReceptionist(idHolder).setCall(false);
						System.out.println(staff.getReceptionist(idHolder).getName() + " has ended a call.");
						break;
					case "3":
						staff.getReceptionist(idHolder).pay();
						break;
					case "4":
						staff.fire(idHolder);
						break;
					case "5":
						exit = true;
						break;
					}

					break;
				case "invalid":
					System.out.println("Please enter a valid employee ID!");
					break;
				}
				break;
			case "2":
				System.out.println("Please enter the type of employee you would like to hire");
				System.out.println("Choose one: doctor, nurse, janitor, receptionist");
				userInput = in.nextLine();
				switch (userInput) {
				case "doctor":
					System.out.println("Enter the name of the doctor you are adding:");
					userInput = in.nextLine();
					System.out.println("Enter the specialty of the doctor you are adding:");
					String specialty = in.nextLine();
					Doctor newDoc = new Doctor(userInput, staff.getId(), specialty);
					staff.addEmployee(newDoc);
					break;
				case "nurse":
					System.out.println("Enter the name of the nurse you are adding:");
					userInput = in.nextLine();
					Nurse newNurse = new Nurse(userInput, staff.getId());
					staff.addEmployee(newNurse);
					break;
				case "janitor":
					System.out.println("Enter the name of the janitor you are adding:");
					userInput = in.nextLine();
					Janitor newJanitor = new Janitor(userInput, staff.getId());
					staff.addEmployee(newJanitor);
					break;
				case "receptionist":
					System.out.println("Enter the name of the receptionist you are adding:");
					userInput = in.nextLine();
					Receptionist newReceptionist = new Receptionist(userInput, staff.getId());
					staff.addEmployee(newReceptionist);
					break;
				default:
					System.out.println("Please enter a valid employee type!");
				}
				break;
			case "3":
				Patient pat = new Patient(reg.getId());
				reg.addPatient(pat);
				System.out.println("You have successfully added a patient! His/Her ID number is " + pat.getIdNum());
				break;
			case "4":
				exit = true;
				break;
			}
			staff.tickAll();
			reg.tickAll();
		} while (!exit);
		System.out.println("Goodbye!");
		in.close();
	}
}
