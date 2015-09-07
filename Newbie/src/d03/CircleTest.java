package org.nitpro.circle.test;

import org.nitpro.circle.Point;
import org.nitpro.circle.Circle;


public class CircleTest {
	public static void main(String[] args) {
		
		Point p = new Point(1,9);

		Circle c = new Circle(1,1,2);
		
		boolean b = c.isIn(p);
		
		System.out.println(b);
	}
}