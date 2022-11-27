/* In an online course portal, each user has a unique code,
 * represented by an integer. 
 * Each instructor on the portal can have several courses,
 * and the same student can enroll in as many courses as 
 * they want. Thus, the total number of students of an
 * instructor is not is simply the sum of students from all
 * courses he has, as there may be repeat students in more
 * than one course.
 * Instructor Alex has three courses A, B and C and wants to
 * know their total number of students.
 * Your program should read Instructor Alex's A, B and C
 * students, then show the total number and students of it.
 */

package application;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import entities.Students12;

public class Program12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Set<Students12> set = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		{
		int n = sc.nextInt();
		for (int i=0 ; i<n ; i++) {
			int number = sc.nextInt();
			set.add(new Students12(number));
		}
		}

		System.out.print("How many students for course B? ");
		{
		int n = sc.nextInt();
		for (int i=0 ; i<n ; i++) {
			int number = sc.nextInt();
			set.add(new Students12(number));
		}
		}
		
		System.out.print("How many students for course C? ");
		{
		int n = sc.nextInt();
		for (int i=0 ; i<n ; i++) {
			int number = sc.nextInt();
			set.add(new Students12(number));
		}
		}
		
		System.out.println("Total students: " + set.size());
		
		sc.close();
	}

}