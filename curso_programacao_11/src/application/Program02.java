package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product01;

public class Program02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		List<Product01> list = new ArrayList<>();
		
		list.add(new Product01("Tv", 900.00));
		list.add(new Product01("Mouse", 50.00));
		list.add(new Product01("Tablet", 350.50));
		list.add(new Product01("HD Case", 80.90));
		
//		list.removeIf(new ProductPredicate02());
//		list.removeIf(Product01::staticProductPredicate);
//		list.removeIf(Product01::nonStaticProductPredicate);
		
//		Predicate<Product01> pred = p -> p.getPrice() >= 100.0;
//		list.removeIf(pred);
		
		list.removeIf(p -> p.getPrice() >= 100.0);
		
		for (Product01 p : list) {
			System.out.println(p);
		}
		
	}

}
