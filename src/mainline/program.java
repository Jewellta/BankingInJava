package mainline;

import banking.Savings;

public class program {

	public static void main(String[] args) {
		Savings s1 = new Savings("My Savings Account");
		try {
			s1.Deposit(125.0);
			s1.Withdraw(25.0);
			s1.payInterest(3);
			System.out.printf("Bal: %f\n", s1.getBalance());
			s1.Withdraw(1000.0);}catch (Exception ex) {
				System.out.printf("%s", ex.getMessage());
		}

	}

}
