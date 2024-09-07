package practical7;

public class InpatientBill extends PatientBill{
	private double specialistCharges, labCharges;
	private char roomType;
	private int durationOfStay;
	private static double standardRate = 100.0;
	private static double privateRate = 200.0;

	public InpatientBill() {

	}

	public InpatientBill(String name, double specialistCharges, double labCharges, char roomType, int durationOfStay) {
		super (name);
		this.specialistCharges = specialistCharges;
		this.labCharges = labCharges;
		this.roomType = roomType;
		this.durationOfStay = durationOfStay;
	}
	
	public double getSpecialistCharges() {
		return specialistCharges;
	}

	public double getLabCharges() {
		return labCharges;
	}

	public char getRoomType() {
		return roomType;
	}

	public int getDurationOfStay() {
		return durationOfStay;
	}

	public void setSpecialistCharges(double specialistCharges) {
		this.specialistCharges = specialistCharges;
	}

	public void setLabCharges(double labCharges) {
		this.labCharges = labCharges;
	}

	public void setRoomType(char roomType) {
		this.roomType = roomType;
	}

	public void setDurationOfStay(int durationOfStay) {
		this.durationOfStay = durationOfStay;
	}

	public String toString() {
		return super.toString() + "\nSpecialist Charges : RM " + specialistCharges + 
				"\nLab Charges : RM " +labCharges +"\nRoom Type : "+ roomType +
				"\nDuration of Stay : " + durationOfStay + "days";
	}
	
	public double calcCharges() {
		double roomCharges = 0;
		if(roomType == 'S') 
			roomCharges = durationOfStay * standardRate;
		else
			roomCharges = durationOfStay * privateRate;
		return specialistCharges + labCharges + roomCharges;
	}
	
}
