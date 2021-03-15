package banking;

public class Account {
	private int accountNumber;
	private String description;
	private Double balance;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public void Deposit (Double amount) throws Exception {
		if (amount <=0) throw new Exception("amount must be positive");
		setBalance(getBalance() + amount);
	}
	
	public void Withdraw(Double amount) throws Exception {
		if (amount <= 0) {throw new Exception("amount must be positive");
		}if (amount > balance){ throw new Exception("insuffecient funds");}
		setBalance(getBalance()-amount);}

	public void Transfer(Account toAccount, double amount) throws Exception{
		Withdraw(amount);
		toAccount.Deposit(amount);
	}
	
		public Account(String description) {
			super();
			this.accountNumber= accountNumber++;
			this.description = description;
			this.balance = 0.0;
		}
		public Account() {
			super();
		}
		
		}

