package org.whatisjava.core;

public class ColorPointTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint();
		cp.color = 1;
		cp.x = 100;
		cp.y = 200;
		System.out.println(cp.distance(2,3));
		
		//Point p1 = new ColorPoint();
		//p1.color = 2;
		
		ColorPoint p3 = new ColorPoint();
		Point p = null;
		p = p3;
	}

}
