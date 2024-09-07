package practical6;

public class Employee {
	private String name;
	private int yearJoined;
	private double basicSalary;

	public Employee() {

	}

	public Employee(String name, int yearJoined, double basicSalary) {
		this.name = name;
		this.yearJoined = yearJoined;
		this.basicSalary = basicSalary;
	}

	public String getName() {
		return name;
	}

	public int getYearJoined() {
		return yearJoined;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setYearJoined(int yearJoined) {
		this.yearJoined = yearJoined;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public String toString() {
		return "Employee name :" + name + "\nYear Joined :" + yearJoined + "\nBasic Salary :" + basicSalary;
	}

	public double calculateSalary() {
		return basicSalary;
	}
	
	public boolean equals(Object o){
        if(o instanceof Employee){
            return name.equals(((Employee)o).name);
        }else
            return false;

    }
	
	
}
