package org.nitpro.lang;


public class Circle {

	Point o;
	int r;

	public Circle() {
		o = new Point(0, 0);
		r = 1;
	}

	public Circle(Point p, int r1) {
		o.x = p.x;
		o.y = p.y;
		r = r1;
	}

	public Circle(int ox1, int oy1, int r1) {
		o = new Point(ox1, oy1);
		r = r1;
	}

	/**
	 * @param p
	 * 
	 * @return
	 */
	public boolean isIn(Point p) {
		int d = o.distance(p);
		return d < r;
	}
}