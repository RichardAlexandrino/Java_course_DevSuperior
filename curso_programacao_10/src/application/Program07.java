package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program07 {

	public static void main(String[] args) {
		
		Set<String> set1 = new HashSet<>();
		
		set1.add("Tv");
		set1.add("Notebook");
		set1.add("Tablet");
		
		System.out.println(set1.contains("Notebook"));
		
		for (String p : set1) {
			System.out.println(p);
		}
		
		System.out.println("-------------");
		
		Set<String> set2 = new TreeSet<>();
		
		set2.add("Tv");
		set2.add("Notebook");
		set2.add("Tablet");
		
		System.out.println(set2.contains("Notebook"));
		
		for (String p : set2) {
			System.out.println(p);
		}
		
		System.out.println("-------------");
		
		Set<String> set3 = new LinkedHashSet<>();
		
		set3.add("Tv");
		set3.add("Notebook");
		set3.add("Tablet");
		
		System.out.println(set3.contains("Notebook"));
		
		for (String p : set3) {
			System.out.println(p);
		}
		
		System.out.println("-------------");
		
		set1.remove("Tablet");
		
		for (String p : set1) {
			System.out.println(p);
		}
		
		System.out.println("-------------");
		
		set2.removeIf(x -> x.length() >= 3);
		
		for (String p : set2) {
			System.out.println(p);
		}
		
		System.out.println("-------------");
		
		set3.removeIf(x -> x.charAt(0) == 'T');
		
		for (String p : set3) {
			System.out.println(p);
		}
	}
}
