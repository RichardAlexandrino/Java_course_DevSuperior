package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account01;
import entities.BusinessAccount01;
import entities.SavingsAccount01;

public class Program01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		// Account01 acc1 = new Account01(1001, "Alex", 1000.0);
		BusinessAccount01 bacc = new BusinessAccount01(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING
		
		Account01 acc2 = bacc;
		Account01 acc3 = new BusinessAccount01(1003, "Bob", 810.0, 500.0);
		Account01 acc4 = new SavingsAccount01(1004, "Anna", 1000.0, 0.01);
		
		// DOWNCAST
		
		BusinessAccount01 acc5 = (BusinessAccount01)acc2;
		acc5.loan(100.0);
		
		// BusinessAccount01 acc5 = (BusinessAccount01)acc3; // ERROR
		if (acc3 instanceof BusinessAccount01) {
			BusinessAccount01 acc6 = (BusinessAccount01)acc3;
			acc6.loan(200.0);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingsAccount01) {
			SavingsAccount01 acc7 = (SavingsAccount01)acc3;
			acc7.updateBalance();
				System.out.println("Update!");
		}
		
		// acc1.withdrawn(200.0);
		// System.out.println(acc1.getBalance());
		
		acc4.withdrawn(200.0);
		System.out.println(acc4.getBalance());
		
		acc3.withdrawn(200.0);
		System.out.println(acc3.getBalance());
		
		System.out.println();
		
		List<Account01> list = new ArrayList<>();
		
		list.add(new SavingsAccount01(1014, "Michael", 2000.0, 0.01));
		list.add(new BusinessAccount01(1016, "Ray", 1500.0, 1000.0));
		list.add(new SavingsAccount01(1017, "Chris", 400.0, 0.01));
		list.add(new BusinessAccount01(1016, "Jhon", 1300.0, 750.0));
		
		double sum = 0.0;
		for (Account01 acc : list) {
			sum += acc.getBalance();
		}
		System.out.printf("Total balance: %.2f%n", sum);
		
		for (Account01 acc : list) {
			acc.deposit(10.0);
		}
		for (Account01 acc : list) {
			System.out.printf("Update balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
		
		
	}

}
