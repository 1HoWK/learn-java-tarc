package Tutorial4;

import java.util.Scanner;

public class ATM {
	static Scanner scan = new Scanner(System.in);
	static Account acc1 = new Account(909, "Ali Baba", 1000);

	public static void main(String[] args) {
		double money;
		char backTo = 0;
		int choice;
		
		do{
			mainMenu();
			choice = scan.nextInt();
			if(choice == 1) {
				System.out.println(acc1.getAccountHolderName() + " balance is " + acc1.getBalance());
			}else if(choice == 2) {
				System.out.print("Amount of CASH IN:");
				acc1.cashIn(money = scan.nextDouble());
				System.out.println(acc1.getAccountHolderName() + " balance is " + acc1.getBalance());
			}else if(choice == 3) {
				System.out.print("Amount of CASH OUT:");
				acc1.cashOut(money = scan.nextDouble());
				System.out.println(acc1.getAccountHolderName() + " balance is " + acc1.getBalance());
			}else if(choice == 4) {
				acc1.setAnnualInterestRate(2.0);
				System.out.println(acc1.getAccountHolderName() + " interest amount is " + acc1.calculateInterest());
			}else if(choice > 5) {
				System.err.println("WRONG NUMBER!!!!\n\n");
				scan.nextLine();
			}else if(choice == 5) {
				System.err.println("You have chosen to EXIT :D");
			}
			if(choice < 5)
			{
				System.out.print("\nPress B BACK TO MENU // Press E EXIT :");
				backTo = Character.toUpperCase(scan.next().charAt(0));	
			}
		}while( backTo == 'B'|| choice > 5);
		if(choice < 5)
		{
			System.err.println("You have chosen to EXIT :D");
		}
		
	}

	public static void mainMenu() {
		System.out.println("Main Menu");
		System.out.println("1 : Check balance");
		System.out.println("2 : Cash In");
		System.out.println("3 : Cash Out");
		System.out.println("4 : Interest");
		System.out.println("5 : Exit");
		System.out.print("Enter a choice : ");
	}

}
