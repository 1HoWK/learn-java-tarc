package Practical3;

public class Loan {
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;

	public Loan() {
	}

	public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
		try {
			this.annualInterestRate = annualInterestRate;
			this.numberOfYears = numberOfYears;
			this.loanAmount = loanAmount;
			loanDate = new java.util.Date();
			if ((this.annualInterestRate <= 0) || (this.numberOfYears <= 0) || (this.loanAmount <= 0)) {
				throw new IllegalArgumentException();
			}
		} catch (IllegalArgumentException ex) {
			System.out.println("Number must be more than 0");
		}

	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		try {
			this.annualInterestRate = annualInterestRate;
			if ((this.annualInterestRate <= 0)) {
				throw new IllegalArgumentException();
			}
		} catch (IllegalArgumentException ex) {
			System.out.println("Number must be more than 0");
		}
	}

	public int getNumberOfYears() {
		return numberOfYears;
	}

	public void setNumberOfYears(int numberOfYears) {
		try {
			this.numberOfYears = numberOfYears;
			if ((this.numberOfYears <= 0)) {
				throw new IllegalArgumentException();
			}
		} catch (IllegalArgumentException ex) {
			System.out.println("Number must be more than 0");
		}
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		try {
			this.loanAmount = loanAmount;
			if ((this.loanAmount <= 0)) {
				throw new IllegalArgumentException();
			}
		} catch (IllegalArgumentException ex) {
			System.out.println("Number must be more than 0");
		}
	}

	/** Find monthly payment */
	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;
		return loanAmount * monthlyInterestRate / (1 - (Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12)));
	}

	/** Find total payment */
	public double getTotalPayment() {
		return getMonthlyPayment() * numberOfYears * 12;
	}

	/** Return loan date */
	public java.util.Date getLoanDate() {
		return loanDate;
	}

	public static void main(String[] args) {
		new Loan(0, 1, 1);
	}
}
