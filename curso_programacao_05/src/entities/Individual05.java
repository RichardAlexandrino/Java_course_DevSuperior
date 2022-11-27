package entities;

public class Individual05 extends TaxPayer05 {

	private Double healthExpenditures;

	public Individual05() {};
	
	public Individual05(String name, Double annualIncome, Double healthExpenditures) {
		super(name, annualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		double discountedValue = 0.0;
		if (healthExpenditures > 0) {
			discountedValue = 0.5 * healthExpenditures;
		}
		if (getAnnualIncome() < 20000.00) {
			return 0.15 * getAnnualIncome() - discountedValue;
		}
		else {
			return 0.25 * getAnnualIncome() - discountedValue;
		}
	}
	
	
}
