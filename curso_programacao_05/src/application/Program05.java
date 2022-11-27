/* Write a program to read the data from N contributors (N provided
 * by user), which can be an individual or a legal entity, and then
 * show the amount of tax paid by each, as well as the total tax
 * collected.
 * 
 * Individual data are: name, annual income and health expenses. 
 * Legal person data are name, annual incom and number of employees. 
 * The rules for tax calculation are the following:
 * 
 * Individuals: people whose income was below 20000.00 pay
 * 15% tax. People with income from 20000.00 onward pay 25% tax. 
 * If the person had health expenses, 50% of these expenses are
 * deducted from the tax. 
 * 
 * Legal entity: pay 16% tax. However if the company has more 
 * than 10 employee, they pay 14% tax.
 */

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company05;
import entities.Individual05;
import entities.TaxPayer05;

public class Program05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer05> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Annual income: ");
			double annualIncome = sc.nextDouble();
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new Individual05(name, annualIncome, healthExpenditures));
			}
			else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new Company05(name, annualIncome, numberOfEmployees));
			}
		}
		
		double totalTax = 0.0;
		System.out.println();
		System.out.println("TAXES PAID: ");
		for (TaxPayer05 taxPayer : list) {
			System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f", taxPayer.tax()));
			totalTax += taxPayer.tax();
		}
		
		System.out.println();
		System.out.print("TOTAL TAXES: $ " + String.format("%.2f", totalTax));

	}

}
