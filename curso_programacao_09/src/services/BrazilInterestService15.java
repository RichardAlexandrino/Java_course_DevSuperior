package services;

public class BrazilInterestService15 implements InterestService15 {

	private double interestRate;
	
	public BrazilInterestService15(double interestRate) {
		this.interestRate = interestRate;
	}
	
	@Override
	public double getInterestRate() {
		return interestRate;
	}

}
