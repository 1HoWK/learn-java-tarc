package practical7;

public class Driver {

	public static void main(String[] args) {
		PatientBill[] bills = { new InpatientBill("Zheng Xing", 300.0, 165.0, 'S', 3),
				new OutpatientBill("Ali Mohd", 250.0), new InpatientBill("Ah Gao", 150.0, 105.0, 'P', 4),
				new OutpatientBill("Yusuf Mohd", 200.0) };

		
		printBills(bills);
		System.out.println("Total bills collection : RM " + computeTotalCollection(bills));
		// sort the bills in asd order of patients' name
		System.out.println("\n\nSorting begins.......");
		java.util.Arrays.sort(bills);
	}

	public static void printBills(PatientBill[] bills) {
		for (int i = 0; i < bills.length; i++) {
			System.out.println(bills[i]);
			System.out.println("-------------------------------");
			System.out.println("Total charges : RM " + bills[i].calcCharges());
			System.out.println("-------------------------------\n\n");
		}
	}

	public static double computeTotalCollection(PatientBill[] bills) {
		double sum = 0;
		for (int i = 0; i < bills.length; i++) {
			sum += bills[i].calcCharges();
		}
		return sum;
	}
}
