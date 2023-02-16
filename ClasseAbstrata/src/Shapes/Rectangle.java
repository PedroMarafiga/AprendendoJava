package Shapes;

import color.enums.Color;

public class Rectangle extends Shape {

	private Double width;
	private Double height;
	
	
	
	public Rectangle(Color color,Double width, Double height) {
		super (color);
		this.width = width;
		this.height = height;
	}



	public void area() {
		System.out.println(width * height);
	}
}
