package model.entities;

import model.enums.Color11;

public abstract class AbstractShape11 implements Shape11 {

	private Color11 color;

	public AbstractShape11(Color11 color) {
		this.color = color;
	}

	public Color11 getColor() {
		return color;
	}

	public void setColor(Color11 color) {
		this.color = color;
	}

}
