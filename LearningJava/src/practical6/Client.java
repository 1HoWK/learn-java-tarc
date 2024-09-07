package practical6;

public class Client {

	public static void main(String[] args) {
		Employee[] empArray = { new Employee("Ho Wai Kit", 2020, 1500.0),
				new CommissionEmployee("Jin", 2020, 1600.0, 2500.0, 0.6), new Clerk("Louis", 2020, 1500.0, 1500.0, 3),
				new Employee("Ho Wai Kit", 2020, 1550.0),
				new CommissionEmployee("Ho Wai Kit", 2020, 2000.0, 2500.0, 0.6),
				new Clerk("Ho Wai Kit", 2020, 1700.0, 1900.0, 3) };

		printElements(empArray);
		for (int i = 0; i < empArray.length; i++) {
			for (int b = 0; b < empArray.length; b++) {
				if (i == b)
					continue;
				else if (empArray[i].equals(empArray[b]))
					System.out.println("\n" + empArray[i].getName() + " equal to " + empArray[b].getName());
			}
		}
	}

	public static void printElements(Object[] o) {
		for (int i = 0; i < o.length; i++) {
			if (o[i] instanceof CommissionEmployee) {
				System.out.println("\nType: Commission Employee");
				System.out.println(o[i]);
			} else if (o[i] instanceof Clerk) {
				System.out.println("\nType: Clerk");
				System.out.println(o[i]);
			} else {
				System.out.println("\nType: Employee");
				System.out.println(o[i]);
			}
		}

	}

}
