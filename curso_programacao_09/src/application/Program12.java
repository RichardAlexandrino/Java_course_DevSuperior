package application;

import devices.Printer12;
import devices.Scanner12;

public class Program12 {

	public static void main(String[] args) {

		Printer12 p = new Printer12("1080");
		p.processDoc("My Letter");
		p.print("My Letter");

		Scanner12 s = new Scanner12("2003");
		s.processDoc("My Email");
		System.out.println("Scan result: " + s.scan());

	}

}
