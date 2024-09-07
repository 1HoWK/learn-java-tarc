package practical6;

public class Clerk extends Employee{
	private double allowance;
	private int overtimeHours;
	private static double overtimeRate = 0.5;

	public Clerk() {
		
	}

	public Clerk(String name, int yearJoined, double basicSalary, double allowance, int overtimeHours) {
		super(name, yearJoined, basicSalary);
		this.allowance = allowance;
		this.overtimeHours = overtimeHours;
	}

	public double getAllowance() {
		return allowance;
	}

	public int getOvertimeHours() {
		return overtimeHours;
	}

	public static double getOvertimeRate() {
		return overtimeRate;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	public void setOvertimeHours(int overtimeHours) {
		this.overtimeHours = overtimeHours;
	}

	public static void setOvertimeRate(double overtimeRate) {
		Clerk.overtimeRate = overtimeRate;
	}
	
	public String toString() {
		return super.toString() + "\nAllowance :" + allowance + "\nOvertime Hours :" + overtimeHours + "\nOvertime rate :" + overtimeRate + "\nNew Salary :" + calculateSalary();
	}
	
	public double calculateSalary() {
		double salary;
		double overtimepay = overtimeHours * overtimeRate;
		return salary = getBasicSalary() + allowance + overtimepay;
	}
	
	public boolean equals(Object o) {
		if (o instanceof Clerk) {
			return super.getName().equals(((Clerk)o).getName()); //casting
		}else
			return false;
	}
}
