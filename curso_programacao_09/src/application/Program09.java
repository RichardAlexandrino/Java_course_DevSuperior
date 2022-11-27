/* A company wants to automate the processing of its contracts.
 * Processing a contract consists of generating the installments
 * to be paid for that contract, based on the desired number of
 * months.
 * The company uses an online payment service to pay the
 * installments. Online payment services typically charge a
 * monthly interest as as well as a fee per payment. For now,
 * the service contracted by the company is Paypal, which applies
 * simple interest of 1% to each installment, plus a payment fee
 * of 2%.
 * Write a program to read the data of a contract (contract number,
 * contract date, and total contract value). Then, the program
 * must read the number of months for the contract to be paid in
 * installments, and then generate the records of installments
 * to be paid (date and amount), with the first installment to
 * be paid one month after the contract date, second installment
 * two months after the contract and so on. Show plot date on the
 * screen. */

package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract09;
import model.entities.ContractService09;
import model.entities.Installment09;
import model.entities.PaypalService09;

public class Program09 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter the contract data: ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.print("Contract value: ");
		double contractValue = sc.nextDouble();
		
		Contract09 contract = new Contract09(number, date, contractValue);
		
		System.out.print("Enter the number of installments: ");
		int numberOfInstallments = sc.nextInt();
		
		ContractService09 contractService = new ContractService09(new PaypalService09());
		
		contractService.processContract(contract, numberOfInstallments);
		
		System.out.println("Installments: ");
		for (Installment09 installment : contract.getInstallments()) {
			System.out.println(installment);
		}
		
		sc.close();
	}

}
