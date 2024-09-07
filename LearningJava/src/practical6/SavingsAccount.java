package practical6;

public class SavingsAccount extends Account {
	private static double interestRate = 0.03;
	
    public SavingsAccount() {
    	this("",0.0);
    }
    public SavingsAccount(String accNo,double balance){
    	super(accNo,balance); //invoke the constructor in the superclass
    }
    
    public double calcInterest(){
    	return getBalance() * interestRate/12;
    }
    
    public void addInterest(){
    	double interest= calcInterest();
    	deposit(interest);
    }
}