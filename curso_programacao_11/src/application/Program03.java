package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import entities.Product03;

public class Program03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		List<Product03> list = new ArrayList<>();
		
		list.add(new Product03("Tv", 900.00));
		list.add(new Product03("Mouse", 50.00));
		list.add(new Product03("Tablet", 350.50));
		list.add(new Product03("HD Case", 80.90));
		
//		list.forEach(new PriceUpdate03());
		
//		list.forEach(Product03::staticPriceUpdate);
		
//		list.forEach(Product03::nonStaticPriceUpdate);
		
		Double factor = 1.1;
//		Consumer<Product03> cons = p -> p.setPrice(p.getPrice() * factor);
//		list.forEach(cons);
		
		list.forEach(p -> p.setPrice(p.getPrice() * factor));
		
		list.forEach(System.out::println);
	}

}
