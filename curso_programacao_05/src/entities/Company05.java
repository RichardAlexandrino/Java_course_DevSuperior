package entities;

public class Company05 extends TaxPayer05 {

	private Integer numberOfEmployees;

	public Company05() {};
	
	public Company05(String name, Double annualIncome, Integer numberOfEmployees) {
		super(name, annualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		if (numberOfEmployees <= 10) {
			return 0.16 * getAnnualIncome();
		}
		else {
			return 0.14 * getAnnualIncome();
		}
	}
}
