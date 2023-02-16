package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Shapes.Circle;
import Shapes.Rectangle;
import Shapes.Shape;
import color.enums.Color;


public class MainShapes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		List<Shape> shapes = new ArrayList<>();
		
		
		for(int i = 0;i < n;i++) {
			System.out.printf("Shape #%d data: \n",i+1);
			System.out.println("Rectangle or circle(r/c): ");
			char c = sc.next().charAt(0);
			
			System.out.println("Color(BLACK,BLUE,RED): ");
			Color color = Color.valueOf(sc.next());

			if(c == 'r' || c == 'R') {
				System.out.println("Rectangle width: ");
				Double width = sc.nextDouble();
				System.out.println("Rectangle height: ");
				Double height = sc.nextDouble();
				
				shapes.add(new Rectangle(color,width,height));
			}
			else {
				System.out.println("Circle radius: ");
				Double radius = sc.nextDouble();
				
				shapes.add(new Circle(color,radius));
			}
		}
		System.out.println("Shape areas: ");
		
		for(Shape s: shapes) {
			s.area();
			System.out.println();
		}
		
		sc.close();
	}

}
