package ch06;

public class Account2 {
	private String accNo;
	private String accName;
	private int balance;
	
	public Account2(String accNo, String accName, int balance) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.balance = balance;
	}
	
	public String getAccNo() {
		return accNo;
	}
	
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	
	public String getAccName() {
		return accName;
	}
	
	public void setAccName(String accName) {
		this.accName = accName;
	}
}
