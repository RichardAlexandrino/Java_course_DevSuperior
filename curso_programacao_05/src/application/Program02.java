/* A company its has own and outsourced employees. For each
 * employee, it wants to record name, worked hours and value
 * per hour. Outsourced employees has an additional expense.
 * 
 * The employees pay correspond to hour value multiplied by
 * worked hours, with the outsource still receive a bonus
 * corresponding to 110% of your additional expense.
 * 
 * Write a program to read the data of N employees (N provided
 * for by the user) and store in a list. Later to read all data, 
 * show name and payment for each employee in the same order they
 * were entered.
 * 
 * Build the program according to the project on the side. Look 
 * example on the next page. 
 */

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee02;
import entities.OutsourcedEmployee02;

public class Program02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee02> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Employee #" + i + " data: ");
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			if (ch == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				list.add(new OutsourcedEmployee02(name, hours, valuePerHour, additionalCharge));
			}
			else {
				list.add(new Employee02(name, hours, valuePerHour));
			}
		}
		
		System.out.println();
		System.out.println("PAYMENTS: ");
		for (Employee02 emp : list) {
			System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));
		}
		
		sc.close();
	}
}
