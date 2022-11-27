package entities;

import entities.enums.Color04;

public abstract class Shape04 {

	private Color04 color;

	public Shape04() {}
	
	public Shape04(Color04 color) {
		this.color = color;
	}

	public Color04 getColor() {
		return color;
	}

	public void setColor(Color04 color) {
		this.color = color;
	}
	
	public abstract double area();
}
