package entities;

public class Product02 {

	public String name;
	public double price;
	public int quantity;
	
	public Product02() {
	}
	
	public Product02(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product02(String name, double price) {
		this.name = name;
		this.price = price;
		this.quantity = 0; // optional, could erase
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
