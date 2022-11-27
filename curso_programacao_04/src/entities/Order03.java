package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus03;

public class Order03 {

	private Date moment;
	private OrderStatus03 status;
	private Client03 client;
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private List<OrderItem03> items = new ArrayList<>();

	public Order03(Date moment, OrderStatus03 status, Client03 client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus03 getStatus() {
		return status;
	}

	public void setStatus(OrderStatus03 status) {
		this.status = status;
	}

	public Client03 getClient() {
		return client;
	}

	public void setClient(Client03 client) {
		this.client = client;
	}

	public List<OrderItem03> getItems() {
		return items;
	}

	public void addItem(OrderItem03 item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem03 item) {
		items.remove(item);
	}
	
	public double total() {
		double sum = 0.0;
		for (OrderItem03 i : items) {
			sum += i.subTotal();
		}
		return sum;
	}	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for (OrderItem03 item : items) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
	
}