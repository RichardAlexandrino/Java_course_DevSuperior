/* AVERAGE EVEN
 * 
 * Write a program to read a vector of N integers. Then, show
 * on the screen the average arithmetic only of the even number read,
 * with one decimal place. If no even number is typed, show the
 * message "No even number!"
 */

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program22 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
		
		System.out.print("How many elements will the vector have? ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		double sum = 0.0;
		int j = 0;
		
		for (int i=0; i<n; i++) {
			System.out.print("Enter a number: ");
			vect[i] = sc.nextInt();
			if (vect[i] % 2 == 0) {
				j ++;
				sum += vect[i];
			}
		}
		
		double avg = sum / j;
		if (sum == 0) {
			System.out.println("No even number!");
		}
		else {
			System.out.printf("Even average = %.1f", avg);
		}
		
		sc.close();

	}

}
