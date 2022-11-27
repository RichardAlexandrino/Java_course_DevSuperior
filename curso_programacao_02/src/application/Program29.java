package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program29 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add("Jhon");
		list.add("Josh");
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("----------");
		
		list.add(2, "Marco");
		for (String x : list) {
			System.out.println(x);
		}

		System.out.println(list.size());
		
		System.out.println("----------");
		
		list.remove("Anna");
		list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("----------");
		
		System.out.println("Index of Bob " + list.indexOf("Bob"));
		System.out.println("Index of Marco " + list.indexOf("Marco"));
		
		System.out.println("----------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList());
		
		for (String x
				: result) {
			System.out.println(x);
		}
		
		System.out.println("----------");
		
		String name1 = list.stream().filter(x -> x.charAt(0) == 'B').findFirst().orElse(null);
		System.out.println(name1);
		
		String name2 = list.stream().filter(x -> x.charAt(0) == 'K').findFirst().orElse(null);
		System.out.println(name2);
		
	}

}
