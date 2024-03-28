package ch06;

public class Account {
	private static int balance = 0;
	final int MIN_BALANCE = 0;
	final int MAX_BALANCE = 1000000;

	public void setBalance(int n) {
		if (n > MIN_BALANCE && n < MAX_BALANCE) {
			balance = n;
		}
	}

	public int getBalance() {
		return balance;
	}
}
