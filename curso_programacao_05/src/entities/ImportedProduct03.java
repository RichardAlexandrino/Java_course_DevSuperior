package entities;

public class ImportedProduct03 extends Product03 {

	private Double customsFee;
	
	public ImportedProduct03() {
		super();
	}

	public ImportedProduct03(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public final Double totalPrice() {
		return getPrice() + customsFee;
	}
	
	@Override
	public final String priceTag() {
		return getName() 
				+ " $ " 
				+ String.format("%.2f", totalPrice())
				+ " (Customs fee: $ " 
				+ String.format("%.2f", customsFee)
				+ ")";
	}
}