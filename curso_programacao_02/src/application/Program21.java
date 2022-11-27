/* BELOW AVERAGE
 * 
 * Write a program to read an integer N and then a
 * vector of N real numbers. Then, display on the screen the 
 * arithmetic average of all elements to three decimal places.
 * After show all the vector elements that is below of the 
 * average, with one decimal place each.
 */

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program21 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many element will the vector have? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		double sum = 0.0;
		
		for (int i=0; i<n; i++) {
			System.out.print("Enter a number: ");
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}
		
		double avg = sum / n;
		System.out.printf("\nVector average = %.3f", avg);
		
		System.out.println("\nElements below average: ");
		for (int i=0; i<n; i++) {
			if (vect[i] < avg) {
				System.out.println(vect[i]);
			}
		}
		
	}

}
