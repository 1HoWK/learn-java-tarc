package practical6;

public class Testing {

	public static void main(String[] args) {
		SavingsAccount ali = new SavingsAccount("12345", 1000.00);
		CurrentAccount abu = new CurrentAccount("12346", 900.00);
		// polymorphic array
		Account[] customers = { new SavingsAccount("12347", 1500.00), new CurrentAccount("12348", 2000.00),
				new SavingsAccount("12348", 1000.00) };

//		ali.deposit(300);
//		abu.deposit(600);
//		abu.withdraw(400);
//		System.out.println(ali); // ali.toString()
//		System.out.println("\n\n" + abu);
//		ali.addInterest();
//		System.out.println("\n\n" + ali);
		
		customers[0].deposit(300);
		customers[1].deposit(600);
		customers[1].withdraw(400);
		System.out.println(customers[0]);
		System.out.println("\n\n" + customers[1]);
		
		if(customers[0].equals(customers[1])) 
			System.out.println("Invalid account no - duplicated");
		if(customers[2].equals(customers[1])) 
			System.out.println("Invalid account no - duplicated");
	}

}
