package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product02;
import services.CalculationService02;

public class Program02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Product02> list = new ArrayList<>();
		
		String path = "C:\\temp\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Product02(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			Product02 x = CalculationService02.max(list);
			System.out.println("Most expensive:");
			System.out.println(x);
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
