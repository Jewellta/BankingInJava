package banking;

public class JavaCompSavings {
	private Account account=null;
	public double InterestRate=0.12;
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public double getInterestRate() {
		return InterestRate;
	}
	public void setInterestRate(double interestRate) {
		InterestRate = interestRate;
	}
	
	public void Deposit(double amount) throws Exception {
		account.Deposit(amount);
	}
	
	public void Withdraw(double amount) throws Exception {
		account.Withdraw(amount);
	}
	
	public double Interest(int months) {
		return account.getBalance()*(InterestRate/12)* months;
	}
	
	
	public void payInterest(int months) throws Exception {
		double interest =Interest(months);
		Deposit(interest);
	}
	
	public int getaccountNumber() {return account.getAccountNumber();}
	public String getDescription ( ) {return account.getDescription();}
	public void setDescription (String description) {account.setDescription(description);}
	public double getBalance() {return account.getBalance();}
	public double getIntRate()	{return InterestRate;}
	public void setIntRate(double IntRate) {this.InterestRate=InterestRate;}
	
	
	
	
	
	
	public JavaCompSavings(String description) {
		account=new Account(description);
	}
	
	public JavaCompSavings() {this("New Savings Account");
	}
}
