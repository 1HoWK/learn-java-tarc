package practical6;

import java.util.Scanner;

public class ATM {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		CurrentAccount peter = new CurrentAccount("33567", 1600);
		int input;
		double amount;
		do {
			menu();
			System.out.println("Enter your choice :");
			input = scan.nextInt();
			if (input == 1) {
				System.out.println("Account balance is RM" + peter.getBalance());
			} else if (input == 2) {
				System.out.print("Enter withdraw amount :");
				amount = scan.nextDouble();
				peter.withdraw(amount);
				if (!peter.withdraw(amount))
					System.out.println("Insufficient balance");
				else
					System.out.println("Withdraw successfull");
			} else if (input == 3) {
				System.out.print("Enter deposit amount :");
				amount = scan.nextDouble();
				peter.deposit(amount);
			}
		} while (input != 4);
	}

	public static void menu() {
		System.out.println("Menu");
		System.out.println("=====================");
		System.out.println("1. Check balance");
		System.out.println("2. Withdraw");
		System.out.println("3. Deposit");
		System.out.println("4. Exit");
	}

}
