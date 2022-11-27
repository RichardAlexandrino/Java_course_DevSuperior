/* Write a program to read the path of a .csv file containing
 * the data of items sold. Each item has a name, unit price
 * and quantity, separated by a comma. You should generate a new
 * file called "summary.csv", located in a subfolder called
 * "out" from the original folder of the source file, containing
 * only the name and the total value for that item (uni
 * price multiplied by quantity), as per example. */

package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product07;

public class Program07 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product07> list = new ArrayList<>();
		
		System.out.print("Enter file path: ");
		
		String sourceFileStr = sc.nextLine();
		
		File sourceFile = new File(sourceFileStr);
		String sourceFolderStr = sourceFile.getParent();
		
		boolean success = new File(sourceFolderStr + "/out").mkdir();
		
		String targetFileStr = sourceFolderStr + "/out/summary.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
			String itemCsv = br.readLine();
			
			while (itemCsv !=null) {
				String[] fields = itemCsv.split(",");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);
				list.add(new Product07(name, price, quantity));
				itemCsv = br.readLine();
			}
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
				for (Product07 item : list) {
					bw.write(item.getName() + "," + String.format("%.2f", item.total()));
					bw.newLine();
				}
				System.out.println(targetFileStr + " created!");
			}
			catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}		
		
	}
}
