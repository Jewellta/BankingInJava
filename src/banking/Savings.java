package banking;

public class Savings extends Account {

	private Account account;
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	private Double interestRate;
	
	private double intRate=0.12;
	
	public double getIntRate() {return intRate;}
	public void setIntRate(double intRate) {this.intRate=intRate;}
	
	public void payInterest(int months) throws Exception{
		double interest= getBalance()* (intRate/12)* months;
		Deposit(interest);
	}
	
	
	
	public Savings(String description) {
		super(description);
	}
	
	public Savings() {
	this("New Savings");}
	}
	
	
