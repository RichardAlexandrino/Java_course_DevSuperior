package application;

import java.util.Scanner;

public class Program32 {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter the number of lines: ");
			int m = sc.nextInt();
			
			System.out.print("Enter the number of columns: ");
			int n = sc.nextInt();
			
			int[][] mat = new int[m][n];
			
			System.out.println("\nEnter the numbers in the matrix: ");
			for (int i=0; i<m; i++) {
				for (int j=0; j<n; j++) {
					mat[i][j] = sc.nextInt();
				}
			}
			
			System.out.print("\nEnter the number to search: ");
			int x = sc.nextInt();
			
			for (int i=0; i<m; i++) {
				for (int j=0; j<n; j++) {
					if (x == mat[i][j]) {
						System.out.println("\nPosition: a" + (i+1) + (j+1));
						if (i > 0) {
							System.out.println("Up: " + mat[i-1][j]);
						}
						if (i < m-1) {
							System.out.println("Down: " + mat[i+1][j]);
						}
						if (j > 0) {
							System.out.println("Left: " + mat[i][j-1]);
						}
						if (j < n-1) {
							System.out.println("Right: " + mat[i][j+1]);
						}
					}
				}
			}
			
			sc.close();

	}
}