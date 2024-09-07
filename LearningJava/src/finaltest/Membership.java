package finaltest;

public class Membership {
	private String packageType;
	private String spa;
	private double monthlyRate;
	private static int totalMembership = 0;

	public Membership() {

	}

	public Membership(String packageType, String spa, double monthlyRate) {
		this.packageType = packageType;
		this.spa = spa;
		this.monthlyRate = monthlyRate;
		totalMembership++;
	}

	public String getPackageType() {
		return packageType;
	}

	public String getSpa() {
		return spa;
	}

	public static int getTotalMembership() {
		return totalMembership;
	}

	public static void setTotalMembership(int totalMembership) {
		Membership.totalMembership = totalMembership;
	}

	public double getMonthlyRate() {
		return monthlyRate;
	}

	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}

	public void setSpa(String spa) {
		this.spa = spa;
	}

	public void setMonthlyRate(double monthlyRate) {
		this.monthlyRate = monthlyRate;
	}

	public double calculateAnnualFee() {
		return monthlyRate*12;
	}
	
	public String toString() {
		return String.format("Package Type: %s \nSpa: %s \nMonthly Rate: RM%.2f \nAnnual Fee: RM%.2f", packageType, spa, monthlyRate, calculateAnnualFee() );
	}
}
	
	
	
