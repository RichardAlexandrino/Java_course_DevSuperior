package application;

import java.util.Locale;
import java.util.Scanner;

import util.Converter;

public class Program08 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price?: ");
		double dolar = sc.nextDouble();
		System.out.print("How many dollars will be bought?: ");
		double reais = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f", Converter.convertDolarReais(reais, dolar));
	
	}
	
}
