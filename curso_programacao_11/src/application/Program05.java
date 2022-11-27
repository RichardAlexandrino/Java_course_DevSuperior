package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product05;
import model.entities.ProductService05;

public class Program05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		List<Product05> list = new ArrayList<>();

		list.add(new Product05("Tv", 900.00));
		list.add(new Product05("Mouse", 50.00));
		list.add(new Product05("Tablet", 350.50));
		list.add(new Product05("HD Case", 80.90));
		
		ProductService05 ps = new ProductService05();
		
		double sum1 = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
		double sum2 = ps.filteredSum(list, p -> p.getPrice() < 100.0);
		
		System.out.println("Sum1 = " + String.format("%.2f", sum1));
		System.out.println("Sum2 = " + String.format("%.2f", sum2));
	}

}
