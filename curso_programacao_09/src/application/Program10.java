package application;

import model.entities.Circle10;
import model.entities.Rectangle10;
import model.entities.Shape10;
import model.enums.Color10;

public class Program10 {

	public static void main(String[] args) {

		Shape10 s1 = new Circle10(Color10.BLACK, 2.0);
		Shape10 s2 = new Rectangle10(Color10.WHITE, 3.0, 4.0);

		System.out.println("Circle color: " + s1.getColor());
		System.out.println("Circle area: " + String.format("%.3f", s1.area()));
		System.out.println("Rectangle color: " + s2.getColor());
		System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));
	}
}
