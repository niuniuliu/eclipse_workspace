package org.whatisjava.core;

/**
 * 
 * @author steven
 */
public class Point {
	int x;

	int y;

	/**
	 * 
	 * @param x1
	 * @param y1
	 */
	public Point(int x1, int y1) {
		x = x1;
		y = y1;
	}
	
	/**
	 * 
	 *
	 */
	public Point() {
		x = 0;
		y = 0;
	}

	/**
	 * 
	 * @param p
	 * @return
	 */
	public int distance(Point p) {
		return distance(p.x, p.y);
	}

	/**
	 * 
	 * @param x1
	 * @param y1
	 * @return
	 */
	public int distance(int x1, int y1) {
		int d = (int) Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1));
		return d;
	}

}
