package application;

import java.util.HashSet;
import java.util.Set;

import entities.Product09;

public class Program09 {

	public static void main(String[] args) {

		Set<Product09> set = new HashSet<>();
		
		set.add(new Product09("Tv", 900.0));
		set.add(new Product09("Notebook", 1200.0));
		set.add(new Product09("Tablet", 400.0));
		
		Product09 prod = new Product09("Notebook", 1200.0);
		
		System.out.println(set.contains(prod));

	}

}
