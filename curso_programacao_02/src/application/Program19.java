/* HIGHEST POSITION
 * 
 * Write a program that reads N real numbers and stores them
 * in a vector. Then, show on the screen the highest numbers
 * in the vector (assuming there are no ties). Also show the
 * position of highest element, considering the first position
 * as 0.
 */

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program19 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many numbers will you type? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		double max = 0.0;
		int j = 0;
		for (int i=0; i<n; i++) {
			System.out.print("Enter a number: ");
			sc.nextLine();
			vect[i] = sc.nextDouble();
			if (vect[i] > max) {
				max = vect[i];
				j = i;
			}
		}
		
		System.out.print("\nHighest value = " + max);
		System.out.print("\nHighest value position = " + j);
		
		sc.close();

	}

}
