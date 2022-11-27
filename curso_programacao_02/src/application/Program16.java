/* VECTOR SUM
 * 
 * Write a program that reads N real numbers and stores them
 * in a vector. Then:
 * - Print all vector's elements
 * - Show on the screen the sum and the average of vector 
 * elements 
 */

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program16 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many number will you type? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Enter a number: ");
			vect[i] = sc.nextDouble();
		}
		
		System.out.println();
		
		double sum = 0.0;
		System.out.printf("Values = ");
		for (int i=0; i<n; i++) {
			System.out.printf(" %.1f ", vect[i]);
			sum += vect[i];
		}
		
		System.out.printf("\nSum = %.2f\n", sum);
		
		double avg = sum / n;
		System.out.printf("Average = %.2f\n", avg);
		
		sc.close();
	}

}
