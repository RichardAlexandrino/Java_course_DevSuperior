package application;

import java.util.Scanner;

import services.PrintService01;

public class Program01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		PrintService01<String> ps = new PrintService01<>();
		
		System.out.print("How many value? ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			String value = sc.next();
			ps.addValue(value);
		}
		
		ps.print();
		System.out.println("Firt: " + ps.first());
		
		sc.close();
	}

}
