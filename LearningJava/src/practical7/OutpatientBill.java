package practical7;

public class OutpatientBill extends PatientBill {
	private double consultationFees;
	private static int registrationFees = 30;

	public OutpatientBill() {

	}

	public OutpatientBill(String name, double consultationFees) {
		super(name);
		this.consultationFees = consultationFees;
	}

	public double getConsultationFees() {
		return consultationFees;
	}

	public void setConsultationFees(int consultationFees) {
		this.consultationFees = consultationFees;
	}
	
	public String toString() {
		return super.toString() + "\nConsultationFees : RM " + consultationFees;
	}
	
	public double calcCharges() {
		double totalCharges;
		return totalCharges = registrationFees + consultationFees;
	}
}
