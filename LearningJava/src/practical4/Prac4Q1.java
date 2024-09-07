package practical4;

public class Prac4Q1 {

	public static void main(String[] args) {
		
		Employee Joh = new Employee();
		Joh.setName("Joh Kin");
		Joh.setSalary(3000.00);
		Employee Abu = new Employee("Abu Said");
		Abu.setSalary(4000);
		Employee Tan = new Employee("Tan Sri", 3500);

		System.out.println("Current salary of " + Joh.getName() + " is RM" + Joh.getSalary());
		System.out.println("Current salary of " + Abu.getName() + " is RM" + Abu.getSalary());
		System.out.println("Current salary of " + Tan.getName() + " is RM" + Tan.getSalary());
		
		if(Joh.getSalary() > Abu.getSalary() && Joh.getSalary() > Tan.getSalary()) {
			
			System.out.println("\nThe highest salary is RM" + Joh.getSalary() + ", " + Joh.getName());
			
		}else if(Abu.getSalary() > Joh.getSalary() && Abu.getSalary() > Tan.getSalary()) {
			
			System.out.println("\nThe highest salary is RM" + Abu.getSalary() + ", " + Abu.getName());
			
		}else if(Tan.getSalary() > Joh.getSalary() && Tan.getSalary() > Abu.getSalary()) {
			
			System.out.println("\nThe highest salary is RM" + Tan.getSalary() + ", " + Tan.getName());
			
		}
			
		double total = Joh.getSalary() + Abu.getSalary() + Tan.getSalary();
		System.out.println("\nTotal salary of 3 person is RM" + total);
		
	}
}
