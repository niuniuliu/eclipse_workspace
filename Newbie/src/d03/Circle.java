package org.nitpro.circle;

public class Circle {
	
	Point o;
	int r;
	
	public Circle(int ox1,int oy1,int r1) {
		o = new Point(ox1,oy1);
		r = r1;
	}

	/**
	 *@param p 
	 *
	 *@return 
	 */
	public boolean isIn(Point p) {
		int d = o.distance(p);
		return d<r;
	}
}