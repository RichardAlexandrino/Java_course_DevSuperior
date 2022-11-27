package model.entities;

import model.enums.Color11;

public class Circle11 extends AbstractShape11 {
	
	private Double radius;

	public Circle11(Color11 color, Double radius) {
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
