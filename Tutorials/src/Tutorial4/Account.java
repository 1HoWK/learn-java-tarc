package Tutorial4;

public class Account {
	private int accountNo;
	private String accountHolderName;
	private double balance;
	static int accountCount;
	private double annualInterestRate;

	public Account(int accountNo, String accountHolderName, double accountBalance){
		this.accountNo = accountNo;
		this.accountHolderName =  accountHolderName;
		this.balance = accountBalance;
		accountCount++;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public void cashIn(double cash) {
		balance += cash;
	}
	
	public void cashOut(double cash) {
		if (cash < balance) {
			balance -= cash;
		}else {
			System.err.println("You have insufficient balance....");
		}
	}
	
	public double calculateInterest() {
		return balance* annualInterestRate;
	}
	
}
