package practical6;

public class CurrentAccount extends Account {
	private int transactionCount;
	private static int freeTransaction = 10;
	private static double transactionFee = 0.50;

	public CurrentAccount() {

	}

	public CurrentAccount(String accNo, double balance) {
		super(accNo, balance); // invoke the constructor in the superclass
		transactionCount = 0;
	}

	public int getTransactionCount() {
		return transactionCount;
	}

	public static int getFreeTransaction() {
		return freeTransaction;
	}

	public static double getTransactionFee() {
		return transactionFee;
	}

	public void setTransactionCount(int transactionCount) {
		this.transactionCount = transactionCount;
	}

	public static void setFreeTransaction(int freeTransaction) {
		CurrentAccount.freeTransaction = freeTransaction;
	}

	public static void setTransactionFee(double transactionFee) {
		CurrentAccount.transactionFee = transactionFee;
	}

	// override the deposit and withdraw methods inherited from the Account class
	public void deposit(double amt) {
		super.deposit(amt);
		transactionCount++;
		if (transactionCount > freeTransaction)
			super.withdraw(transactionFee);
	}

	public boolean withdraw(double amount) {
		boolean successful = super.withdraw(amount);
		if (successful) {
			transactionCount++;
			if (transactionCount > freeTransaction)
				super.withdraw(transactionFee);
			
		}
		return successful;
	}
	
	//override tostring() method inherited from the Account Class
	public String toString(){
    	return super.toString() + "\nNumber of Transaction :" +transactionCount;
    }

}
