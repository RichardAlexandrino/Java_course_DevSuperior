/* Make a program to read the data (name, email and salary)
 * of employees from a file in .csv format.
 * Then show, in alphabetical order, the employees email whose
 * salary exceeds a giver amount provided by the user.
 * Also show the sum of employees salaries whose name starts
 * with 'M'. */

package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee09;

public class Program09 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			List<Employee09> list = new ArrayList<>();
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Employee09(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			System.out.print("Enter salary: ");
			double salary = sc.nextDouble();
			
			System.out.print("Enter the intial letter name: ");
			char initialLetter = sc.next().charAt(0);
			
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary) + ":");
			
			List<String> emails = list.stream()
					.filter(p -> p.getSalary() > salary)
					.map(p -> p.getEmail())
					.sorted(comp)
					.collect(Collectors.toList());
			
			emails.forEach(System.out::println);
			
			double sum = list.stream()
					.filter(p -> p.getName().charAt(0) == initialLetter)
					.map(p -> p.getSalary())
					.reduce(0.0, (x,y) -> x+y);
			
			System.out.println("Sum of salary of people whose name starts with '" + initialLetter + "': " + sum);
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();

	}

}
