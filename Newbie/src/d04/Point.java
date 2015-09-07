package org.nitpro.lang;

public class Point {

	int x;
	int y;
	
	public Point(int x){
		this.x =x;
	}
	
	public Point(int x,int y) {
		this(x);
//		this.x = x;
		this.y = y;
	}
	
	public int distance(){
		int d = (int)Math.sqrt(x*x + y*y);
		return d;
	}
	
	public int distance(Point p) {
		int d = (int)Math.sqrt((x-p.x)*(x-p.x)+ (y-p.y)*(y-p.y));
		return d;
	}
}
