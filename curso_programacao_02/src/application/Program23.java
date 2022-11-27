/* OLDER
 * 
 * Write a program to read a set of people's names and their
 * respective ages. The names must be stored in one vector,
 * and the ages in another vector. Then, show on the screen
 * the oldest person.
 */

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program23 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("How many people will you type? ");
		int n = sc.nextInt();
		String[] vectName = new String[n];
		int[] vectAge = new int[n];
		int olderAge = 0;
		int positionOlder = 0;
		
		for (int i=0; i<n; i++) {
			System.out.println(i+1 + " person data:");
			System.out.print("Name: ");
			vectName[i] = sc.next();
			System.out.print("Age: ");
			vectAge[i] = sc.nextInt();
			if (vectAge[i] > olderAge) {
				olderAge = vectAge[i];
				positionOlder = i;
			}
			
		}
		
		System.out.println("Older person: " + vectName[positionOlder]);
		
		sc.close();

	}

}
