package application;

import devices.ComboDevice13;
import devices.ConcretePrinter13;
import devices.ConcreteScanner13;

public class Program13 {

	public static void main(String[] args) {

		ConcretePrinter13 p = new ConcretePrinter13("1080");
		p.processDoc("My Letter");
		p.print("My Letter");
		
		System.out.println();
		ConcreteScanner13 s = new ConcreteScanner13("2003");
		s.processDoc("My Email");
		System.out.println("Scan result: " + s.scan());

		System.out.println();
		ComboDevice13 c = new ComboDevice13("2081");
		c.processDoc("My dissertation");
		c.print("My dissertation");
		System.out.println("Scan result: " + c.scan());

	}

}
