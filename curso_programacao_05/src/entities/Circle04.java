package entities;

import entities.enums.Color04;

public class Circle04 extends Shape04 {

	private Double radius;
	
	public Circle04() {
		super();
	}
	
	public Circle04(Color04 color, Double radius) {
		super(color);
		this.radius = radius;
	}
	
	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}

}
