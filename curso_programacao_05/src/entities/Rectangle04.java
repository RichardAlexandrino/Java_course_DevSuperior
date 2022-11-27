package entities;

import entities.enums.Color04;

public class Rectangle04 extends Shape04{

	private Double width;
	private Double height;
	
	public Rectangle04() {};

	public Rectangle04(Color04 color, Double width, Double height) {
		super(color);
		this.width = width;
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public double area() {
		return width * height;
	}

}
