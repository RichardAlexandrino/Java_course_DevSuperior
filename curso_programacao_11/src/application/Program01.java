package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product01;

public class Program01 {

	public static void main(String[] args) {

		List<Product01> list = new ArrayList<>();
		
		list.add(new Product01("TV", 900.00));
		list.add(new Product01("Tablet", 450.00));
		list.add(new Product01("Notebook", 1200.00));
		
//		Comparator<Product01> comp = new Comparator<Product01>() {
//			@Override
//			public int compare(Product01 p1, Product01 p2) {
//				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//			}
//		};
		
//		Comparator<Product01> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		for (Product01 p : list) {
			System.out.println(p);
		}

	}

}
