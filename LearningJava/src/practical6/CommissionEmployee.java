package practical6;

public class CommissionEmployee extends Employee{
	private double grossSale;
	private double commissionRate;

	public CommissionEmployee() {

	}

	public CommissionEmployee(String name, int yearJoined, double basicSalary, double grossSale, double commissionRate) {
		super(name,  yearJoined,  basicSalary);
		this.grossSale = grossSale;
		this.commissionRate = commissionRate;
	}

	public double getGrossSale() {
		return grossSale;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setGrossSale(double grossSale) {
		this.grossSale = grossSale;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	
	public String toString() {
		return super.toString() + "\nGross sale :" + grossSale + "\nCommission Rate :" + commissionRate + "\n New Salary :" + calculateSalary();
	}
	
	public double calculateSalary() {
		double salary;
		return salary = super.getBasicSalary() + grossSale * commissionRate;
	}
	
	public boolean equals(Object o) {
		if (o instanceof CommissionEmployee) {
			return super.getName().equals(((CommissionEmployee)o).getName()); //casting
		}else
			return false;
	}
	
}
