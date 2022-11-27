/* HEIGHTS
 * 
 * Write a program to read the name, age and height of N people,
 * as an example. Then, show on the screen the average
 * heights of the people, and also show the percentage of 
 * people under sixteen, as well as the name of those persons,
 * if any.
 */

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Guests;

public class Program17 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many people will entered? ");
		int n = sc.nextInt();
		Guests[] vect = new Guests[n];
		
		for (int i=1; i<n+1; i++) {
			System.out.println("Person " + i + " data: ");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Age: ");
			int age = sc.nextInt();
			System.out.print("Height: ");
			double height = sc.nextDouble();
			vect[i-1] = new Guests(name, age, height);
		}
		
		System.out.println();
		
		double sum = 0.0;
		int verif = 0;
		double perc = 0;
		for (int i=0; i<n; i++) {
			sum += vect[i].getHeight();
			verif = vect[i].getAge();
			if(verif < 16) {
				double h = Double.valueOf(n);
				perc += ((1/h) * 100);
			}
		}
		
		double avg = sum/n;
		System.out.printf("Average height: %.2f\n", avg);
		System.out.printf("People under 16 years old: %.1f%%\n", perc);
		
		for (int i=0; i<n; i++) {
			verif = vect[i].getAge();
			if(verif<16) {
				System.out.println(vect[i].getName());
			}
		}
		
		sc.close();

	}

}
