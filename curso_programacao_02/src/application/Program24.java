/* APPROVED
 * 
 * Write a program to read a set of N students name, as well the 
 * grade point they got in the first and second semesters.
 * Each of this information must be stored in a vector.
 * Then, print the names of the approved students, considering
 * those whose grade point average is bigger or equal to six.
 */

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program24 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many students will be entered? ");
		int n = sc.nextInt();
		String[] vectName = new String[n];
		double[] vectGrade1 = new double[n];
		double[] vectGrade2 = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.println("Enter name, first and second grade of student " + (i+1) + ": ");
			sc.nextLine();
			vectName[i] = sc.nextLine();
			vectGrade1[i] = sc.nextDouble();
			vectGrade2[i] = sc.nextDouble();
		}
		
		System.out.println("Approved students:");
		for (int i=0; i<n; i++) {
			if (((vectGrade1[i] + vectGrade2[i]) / 2) >= 6) {
				System.out.println(vectName[i]);
			}
		}
		
		sc.close();
		
	}

}
