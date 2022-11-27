package entities;

public class OrderItem03 {

	private Integer quantity;
	private Double price;
	private Product03 product;

	public OrderItem03(Integer quantity, Double price, Product03 product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Product03 getProduct() {
		return product;
	}

	public void setProduct(Product03 product) {
		this.product = product;
	}

	public double subTotal() {
		return quantity * price;
	}

	@Override
	public String toString() {
		return product.getName()
				+ ", $"
				+ String.format("%.2f", price)
				+ ", Quantity: "
				+ quantity
				+ ", Subtotal: $"
				+ String.format("%.2f", subTotal());
	}
	
}
