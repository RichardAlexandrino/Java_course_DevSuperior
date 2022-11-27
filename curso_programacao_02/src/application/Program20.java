/* SUM VECTORS
 * 
 * Write a program to read two vector A and B, each containing
 * N elements. Then, generate a third vector C where
 * each element of C is the sum of corresponding element
 * of A and B. Print the generated vector C.
 */

package application;

import java.util.Scanner;

public class Program20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many values will in each vector have? ");
		int n = sc.nextInt();
		int[] vectA = new int[n];
		int[] vectB = new int[n];
		int[] vectC = new int[n];
		
		System.out.println("Enter the value of vector A: ");
		for (int i=0; i<n; i++) {
			vectA[i] = sc.nextInt();
		}
		
		System.out.println("Enter the value of vector B: ");
		for (int i=0; i<n; i++) {
			vectB[i] = sc.nextInt();
		}
		
		System.out.println("Resulting vector: ");
		for (int i=0; i<n; i++) {
			vectC[i] = vectA[i] + vectB[i];
			System.out.println(vectC[i]);
		}
		
		sc.close();

	}

}
