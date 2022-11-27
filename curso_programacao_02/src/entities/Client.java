package entities;

public class Client {

	private String name;
	private int accountNumber;
	private double currentBalance;
	
	public Client() {
	}
	
	public Client(String name, int accountNumber) {
		this.name = name;
		this.accountNumber = accountNumber;
	}

	public Client(String name, int accountNumber, double initialDeposit) {
		this.name = name;
		this.accountNumber = accountNumber;
		deposit(initialDeposit);
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public double getCurrentBalance() {
		return currentBalance;
	}
	
	public void deposit(double deposit) {
		this.currentBalance += deposit;
	}
	
	public void withdraw(double withdraw) {
		this.currentBalance -= (withdraw +5) ;
	}
	
	public String toString() {
		return "Account "
				+ accountNumber
				+ ", Holder: "
				+ name
				+ ", Balance: $ "
				+ String.format("%.2f", currentBalance);
	}
}
