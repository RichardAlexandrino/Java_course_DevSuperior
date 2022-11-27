/* Read data from an order with N items (N provided by user). Than,
 * show request summary as per the example. Note: the request 
 * instant must be the system instant.
 */

package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client03;
import entities.Order03;
import entities.OrderItem03;
import entities.Product03;
import entities.enums.OrderStatus03;

public class Program03 {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String clientName = sc.nextLine();
		System.out.print("Email: ");
		String clientEmail = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client03 client = new Client03(clientName, clientEmail, birthDate);
		// !!!!!!!!!! Order03 order = new Order03()
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus03 status = OrderStatus03.valueOf(sc.next());
		
		Order03 order = new Order03(new Date(), status, client);
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String item = sc.nextLine();
			System.out.print("Product price: ");
			Double price = sc.nextDouble();
			Product03 product = new Product03(item, price);
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			OrderItem03 orderItem = new OrderItem03(quantity, price, product);
			
			order.addItem(orderItem);
			
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		
		sc.close();
	}

}
