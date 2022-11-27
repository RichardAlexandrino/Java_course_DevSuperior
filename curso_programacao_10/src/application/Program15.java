/* In the vote count for an election, several records are
 * generated ballot containing the name of candidate and
 * the number of votes (.csv format) that be obtained from
 * a ballot box. You must make a program to read the voting
 * records from a file, and then generate a consolidated
 * report with the totals for each candidate.
 */

package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> ballot = new HashMap<>();
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				String candidate = fields[0];
				Integer votes = Integer.parseInt(fields[1]);
				
				if (ballot.containsKey(candidate)) {
					int votesSoFar = ballot.get(candidate);
					ballot.put(candidate, votes + votesSoFar);
				}
				else {
					ballot.put(candidate, votes);
				}
				line = br.readLine();
			}
			for (String key : ballot.keySet()) {
				System.out.println(key + ": " + ballot.get(key));
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}

}
