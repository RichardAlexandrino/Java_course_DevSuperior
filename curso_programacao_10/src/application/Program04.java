package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle04;
import entities.Rectangle04;
import entities.Shape04;

public class Program04 {

	public static void main(String[] args) {
		
		List<Shape04> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle04(3.0, 2.0));
		myShapes.add(new Circle04(2.0));
		
		List<Circle04> myCircles = new ArrayList<>();
		myCircles.add(new Circle04(2.0));
		myCircles.add(new Circle04(3.0));
		
		System.out.println("Total area: " + totalArea(myCircles));
	}
	
	public static double totalArea(List<? extends Shape04> list) {
		double sum = 0.0;
		for (Shape04 s : list) {
			sum += s.area();
		}
		return sum;
	}
}