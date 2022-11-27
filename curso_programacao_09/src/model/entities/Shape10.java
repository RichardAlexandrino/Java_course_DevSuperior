package model.entities;

import model.enums.Color10;

public abstract class Shape10 {
	
	private Color10 color;

	public Shape10(Color10 color) {
		this.color = color;
	}

	public Color10 getColor() {
		return color;
	}

	public void setColor(Color10 color) {
		this.color = color;
	}

	public abstract double area();
}
