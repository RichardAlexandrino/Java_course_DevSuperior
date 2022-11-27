package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program06 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		student.name = sc.nextLine();
		student.a1 = sc.nextDouble();
		student.a2 = sc.nextDouble();
		student.a3 = sc.nextDouble();
		
		System.out.println(student);
		
		if (student.gradeCalculation() < 60) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.approval());
		}
		else {
			System.out.println("PASS");
			
		}

	}

}
