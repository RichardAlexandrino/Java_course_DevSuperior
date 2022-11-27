/* The owner of a boarding house has ten rooms for rent to 
 * students, these rooms being identified by the numbers 0 to 9.
 * 
 * Write a program that starts with all ten rooms empty, and
 * then read an amount N representing the number of students
 * who will rent room (N can be from 1 to 10). Then, 
 * record the rent the of N students. For each rental record,
 * inform the student's name and email, as well as which of the
 * room he choose (from 0 to 9). Suppose a spare room is chosen.
 * At the end, your program should print a report of all
 * boarding houses, in order of room, as in the example.
 */

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program26 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] vect = new Rent[10];
		
		System.out.print("How many rooms will be renterd? ");
		int n = sc.nextInt();

		for (int i=0; i<n; i++) {
			System.out.println();
			System.out.println("Rent #" + (i+1));
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room - 1] = new Rent(name, email);
		}
		
		System.out.println("\nBusy rooms:");
		for (int i=0; i<9; i++) {
			if (vect[i] != null) {
				System.out.println((i+1) + ": " + vect[i]);
		}
		}
		sc.close();
	}

}
