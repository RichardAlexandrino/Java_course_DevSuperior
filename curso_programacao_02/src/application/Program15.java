/* NEGATIVES
 * 
 * Write a program that reads a positive integer N
 * (max = 10) and then N integers and store them in a
 * vector. Then, show on the screen all the negative numbers 
 * read.
 */

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program15 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many number will you type (max: 10)? ");
		int n = sc.nextInt(); 
		
		if (n<11) {
			int[] vect = new int[n];
			
			for (int i=0; i<n; i++) {
				System.out.print("Enter a number: ");
				vect[i] = sc.nextInt();

			}
			System.out.println("Negative numbers: ");
			
			for (int i=0; i<n; i++) {
				if (vect[i] < 0) {
					System.out.println(vect[i]);
				}
			}
		}
		else System.out.println("Error \nMaximum numbers 10!");
		
		sc.close();
			
	}

}
