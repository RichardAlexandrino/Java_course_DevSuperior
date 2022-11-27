/* Write a program to read the data of N products (N provided
 * by user). At end, show the price tag of each product on
 * the same order in which they were entered.
 * 
 * Every products has a name and price. Imported products have a 
 * customs fee, and used products have manufacturing date. These
 * specifics data must be added to the price tag as example.
 * For imported products, the fee and customs must be added of the
 * final price of the product.
 */

package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct03;
import entities.Product03;
import entities.UsedProduct03;

public class Program03 {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product03> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Product #" + i + "data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if (ch == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				list.add(new UsedProduct03(name, price, manufactureDate));
			}
			else if (ch == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProduct03(name, price, customsFee));
			}
			else {
				list.add(new Product03(name, price));
			}
		}
			
		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product03 product : list) {
			System.out.println(product.priceTag());
		}
			
		sc.close();
		
	}

}
