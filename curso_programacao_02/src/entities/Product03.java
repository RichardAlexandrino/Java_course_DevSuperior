package entities;

public class Product03 {

	private String name;
	private double price;
	private int quantity;
	
	public Product03() {
	}
	
	public Product03(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product03(String name, double price) {
		this.name = name;
		this.price = price;
		this.quantity = 0; // optional, could erase
	}
	
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
