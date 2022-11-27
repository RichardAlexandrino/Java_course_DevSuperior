package application;

import java.util.HashMap;
import java.util.Map;
import entities.Product14;

public class Program14 {
	
	public static void main(String[] args) {
		
		Map<Product14, Double> stock = new HashMap<>();
		
		Product14 p1 = new Product14("Tv", 900.0);
		Product14 p2 = new Product14("Notebook", 1200.0);
		Product14 p3 = new Product14("Tablet", 400.0);
		
		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		
		Product14 ps = new Product14("Tv", 900.0);
		
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
	}
}