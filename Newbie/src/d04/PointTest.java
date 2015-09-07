package org.nitpro.lang;

public class PointTest {
	public static void main(String[] args){
		Point o = new Point(3,4);
		Point o1 = new Point(3,4);
		Point p = new Point(2,3);		
		
		int d = o.distance();
		int d1 =  o.distance(p);
		
		System.out.println(d + "--" + d1);
		
		
		
	}
}
