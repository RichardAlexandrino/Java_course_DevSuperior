package application;

import java.util.Date;

import entities.Order01;
import entities.enums.OrderStatus01;

public class Program04 {

	public static void main(String[] args) {

		Order01 order = new Order01(1080, new Date(), OrderStatus01.PENDING_PAYMENT);
		
		System.out.println(order);
		
		OrderStatus01 os1 = OrderStatus01.DELIVERED;
		
		OrderStatus01 os2 = OrderStatus01.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
	}

}
