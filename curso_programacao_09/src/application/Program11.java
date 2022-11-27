package application;

import model.entities.AbstractShape11;
import model.entities.Circle11;
import model.entities.Rectangle11;
import model.enums.Color11;

public class Program11 {

	public static void main(String[] args) {

		AbstractShape11 s1 = new Circle11(Color11.BLACK, 2.0);
		AbstractShape11 s2 = new Rectangle11(Color11.WHITE, 3.0, 4.0);

		System.out.println("Circle color: " + s1.getColor());
		System.out.println("Circle area: " + String.format("%.3f", s1.area()));
		System.out.println("Rectangle color: " + s2.getColor());
		System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));

	}

}
