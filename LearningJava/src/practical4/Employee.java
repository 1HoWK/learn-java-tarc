package practical4;

public class Employee {

	private String name;
	private double salary;

	
	// getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Employee(){
		name = "";
		salary = 0.0;
	}
	
	public Employee(String employeeName){
		name = employeeName;
		salary = 0.0;
	}
	
	public Employee(String employeeName, double currentSalary) {
		name = employeeName;
		salary = currentSalary;
	}
	
	public void raiseSalary(double percent) {
		salary = salary + (salary * percent / 100.0);
	}

}
