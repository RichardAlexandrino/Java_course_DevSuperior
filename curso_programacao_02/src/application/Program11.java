package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product04;

public class Program11 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product04 p = new Product04();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		Product04 product = new Product04(name, price);
		

		System.out.println("Update name: " + product.getName());
		product.setPrice(1200);
		System.out.println("Update price: " + product.getPrice());
		
		System.out.println();
		System.out.println("Product data:" + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data:" + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data:" + product);
		
		sc.close();
	}

}
