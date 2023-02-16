package Shapes;

import color.enums.Color;

public class Circle extends Shape{

	private Double radius;
	
	
	
	public Circle(Color color,Double radius) {
		super(color);
		this.radius = radius;
	}



	public void area() {
		System.out.println(Math.PI * radius * radius);
	}
}
