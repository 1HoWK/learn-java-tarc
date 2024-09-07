package practical6;

import java.util.Date;

public class Account {
	private String accNo;
	private double balance;
	private Date dateCreated;

	public Account() {
		this("", 0.0);
	}

	public Account(String accNo, double balance) {
		this.accNo = accNo;
		this.balance = balance;
		dateCreated = new Date(); // current date
	}

	// getters and setters
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getAccNo() {
		return accNo;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amt) {
		balance += amt;
	}

	public boolean withdraw(double amt) {
		if (balance > amt) {
			return false;
		} else {
			balance -= amt;
			return true;
		}

	}

	// override the toString() method inherited from the object class
	public String toString() {
		return "Account Number : " + accNo + "\nDate Opened : " + dateCreated + "\nBalance : RM " + balance;
	}

	// override the toString() method inherited from the object class
	public boolean equals(Object o) {
		if (o instanceof Account) {
			return accNo == ((Account)o).accNo; //casting
		}else
			return false;
	}

}