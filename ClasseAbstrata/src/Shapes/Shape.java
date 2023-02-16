package Shapes;

import color.enums.Color;

public abstract class Shape {

	Color color;
	
	
	public Shape(Color color) {
		
		this.color = color;	
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public abstract void area();
}
