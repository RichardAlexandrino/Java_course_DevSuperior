/* EVEN NUMBERS
 * 
 * Write a program that reads N integers and stores them in a
 * vector. Then, show on the screen all the even numbers, and
 * also the the amount of even numbers
 */

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CheckEven;

public class Program18 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many numbers will you type? ");
		int n = sc.nextInt();
		int t = 0;
		CheckEven[] vect = new CheckEven[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Enter a number: ");
			int number = sc.nextInt();
			vect[i] = new CheckEven(number);

		}
		
		System.out.println();
		
		System.out.println("Even numbers: ");
		for (int i=0; i<n; i++) {
			if (vect[i].getNumber()%2 == 0) {
				System.out.print(vect[i].getNumber() + "  ");
				t += 1;
			}
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("The amount of even number: " + t);
		
		sc.close();

	}

}