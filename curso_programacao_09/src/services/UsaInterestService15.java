package services;

public class UsaInterestService15 implements InterestService15 {

	private double interestRate;
	
	public UsaInterestService15(double interestRate) {
		this.interestRate = interestRate;
	}
	
	@Override
	public double getInterestRate() {
		return interestRate;
	}

}
