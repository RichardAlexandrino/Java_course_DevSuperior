package entities;

public class Product04 {

	private String name;
	private double price;
	private int quantity;
	
	public Product04() {
		
	}
	
	// Right button, source, Generate const using fields, click on the 3, generate 
	public Product04(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Product04(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	// Right button, source, Generate getters and setters, click on the 3, generate 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) { // differents "quantity"
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
				+ ", $ "
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}