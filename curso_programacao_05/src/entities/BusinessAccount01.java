package entities;

public class BusinessAccount01 extends Account01 {

	private Double loanLimit;
	
	public BusinessAccount01() {
		super();
	}

	public BusinessAccount01(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	
	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}
	
	@Override
	public void withdrawn(double amount) {
		super.withdrawn(amount);
		balance -= + 2.0;
	}

}
