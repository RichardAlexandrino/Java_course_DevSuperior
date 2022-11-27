package entities;

public final class SavingsAccount01 extends Account01 {

	private Double interestRate;
	
	public SavingsAccount01() {
		super();
	}

	public SavingsAccount01(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestsRate() {
		return interestRate;
	}

	public void setInterestsRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	@Override
	public void withdrawn(double amount) {
		balance -= amount;
	}
}
