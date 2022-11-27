package entities;

import java.util.Date;
import entities.enums.OrderStatus01;

public class Order01 {

	private Integer id;
	private Date moment;
	private OrderStatus01 status;
	
	public Order01() {
		
	}

	public Order01(Integer id, Date moment, OrderStatus01 status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus01 getStatus() {
		return status;
	}

	public void setStatus(OrderStatus01 status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order01 [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}
	
	
}
