package application;

import java.util.Set;
import java.util.TreeSet;

import entities.Product09;

public class Program10 {

	public static void main(String[] args) {

		Set<Product09> set = new TreeSet<>();
		
		set.add(new Product09("Tv", 900.0));
		set.add(new Product09("Notebook", 1200.0));
		set.add(new Product09("Tablet", 400.0));
		
		for (Product09 p : set) {
			System.out.println(p);
		}

	}
}
