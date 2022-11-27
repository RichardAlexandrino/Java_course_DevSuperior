/* In a bank, to register a bank account, it is necessary 
inform the account number, the name of the holder and the value of 
initial deposit that the holder deposited when opening
the account. This initial deposit amount,
however, it is optional, that is: if the holder don't have
money to deposit at the time of opening his account, the initial
deposit will not be done and the opening account balance will be, 
naturally, zero.

Important: once an account has been opened, the account number
can never be changed. The holder name is to be changed (since a person
can change his on the occasion of a wedding, for example).
 
Finally, the account balance can't be freely changed. It is necessary
exist a mechanism to protect this. The balance can be increase
through deposits, and only decreases through withdrawals. For each
withdrawals made, the bank charges a fee 5$. Note: the account
may have a negative balance if the balance isn't enough to carry out
withdrawals and/or to pay the fee.

You must make a program that performs the account registration,
giving the option to inform or not the value of the initial deposit.
Then, to realize a deposit and then a withdrawals, always
showing the account data after each operation.
*/

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Client;

public class Program12 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Client client01;
		
		System.out.print("Enter accout number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char yOrNo = sc.next().charAt(0);
		if(yOrNo == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			client01 = new Client(name, accountNumber, initialDeposit);
		}
		else {
			client01 = new Client(name, accountNumber);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(client01);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		client01.deposit(deposit);
		
		System.out.println("Updated account data: ");
		System.out.println(client01);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		client01.withdraw(withdraw);
		
		System.out.println("Updated account data: ");
		System.out.println(client01);
		
		sc.close();

	}

}
