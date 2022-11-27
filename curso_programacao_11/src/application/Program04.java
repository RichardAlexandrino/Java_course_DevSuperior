package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product04;

public class Program04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		List<Product04> list = new ArrayList<>();

		list.add(new Product04("Tv", 900.00));
		list.add(new Product04("Mouse", 50.00));
		list.add(new Product04("Tablet", 350.50));
		list.add(new Product04("HD Case", 80.90));
		
//		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		
//		List<String> names = list.stream().map(Product04::staticUpperCaseName).collect(Collectors.toList());
		
//		List<String> names = list.stream().map(Product04::nonStaticUpperCaseName).collect(Collectors.toList());
		
//		Function<Product04, String> func = p -> p.getName().toUpperCase();
//		List<String> names = list.stream().map(func).collect(Collectors.toList());

		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		names.forEach(System.out::println);
		
	}

}
