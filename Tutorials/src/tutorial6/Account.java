package tutorial6;
import java.util.Date;

public class Account {
	private int accountNo;
	private String accountHolderName;
	private double accountBalance;
	private double annualInterestRate;

	public Account() {
		this(0,"",0.0,0.0);
	}

	public Account(int accountNo, String accountHolderName, double accountBalance, double annualInterestRate) {
		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
		this.annualInterestRate = annualInterestRate;
	}

	

	

}