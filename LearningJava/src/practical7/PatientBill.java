package practical7;

public abstract class PatientBill {
	protected int visitID;
	protected String name;
	private static int lastvisitID = 101;

	public PatientBill() {

	}

	public PatientBill(String name) {
		visitID = lastvisitID;
		this.name = name;
		lastvisitID++;
	}

	public int getVisitID() {
		return visitID;
	}

	public String getName() {
		return name;
	}

	public void setVisitID(int visitID) {
		this.visitID = visitID;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "Visit ID : " + visitID + "\nPatient Name : " + name;
	}

	// abstract method - cannot be implemented
	public abstract double calcCharges();

	// comparable interface contains compareTo abstract
	public int compareTo(Object o) {
		PatientBill obj = (PatientBill) o;
		return name.compareTo(obj.name);
	}
}
