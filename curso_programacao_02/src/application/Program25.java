/* PERSONAL DATAS
 * 
 * These are a dataset containing the height and gender (M, F) of N
 * people. Write a program to calculate and write the
 * tallest and shortest height in the group, the average height of the women,
 * and the number of men.
 */

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program25 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many people will be entered? ");
		int n = sc.nextInt();
		double[] vectHeight = new double[n];
		char[] vectGender = new char[n];
		double shortest = 10;
		double tallest = 0;
		double sum = 0;
		double k = 0;
		int j = 0;
			
		for (int i=0; i<n; i++) {
			System.out.print((i+1) + " person height: ");
			vectHeight[i] = sc.nextDouble();
			System.out.print((i+1) + " person gender: ");
			vectGender[i] = sc.next().charAt(0);
			if (vectHeight[i] < shortest) {
				shortest = vectHeight[i];
			}
			if (vectHeight[i] > tallest) {
				tallest = vectHeight[i];
			}
			if (vectGender[i] == 'f') {
				sum += vectHeight[i];
				k ++;
			}
			if (vectGender[i] == 'm') {
				j ++;
			}
		}
		
		double avg = sum / k;
		System.out.printf("Shortest height = %.2f", shortest);
		System.out.printf("\nTallest height = %.2f", tallest);
		System.out.printf("\nHeight average of the women = %.2f", avg);
		System.out.println("\nNumber of men = " + j);
		
		sc.close();
	}

}
