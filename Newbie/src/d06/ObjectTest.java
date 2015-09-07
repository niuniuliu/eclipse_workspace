package org.whatisjava.lang;

import java.util.Date;

public class ObjectTest {
	public static void main(String[] args) {
		Point p = new Point(3,4);
		//System.out.println(p.toString());
		System.out.println(p);
		
		Date date = new Date();
		System.out.println(date);
		
		Point p1 = new Point(3,4);
		Point p2 = new Point(3,4);
		System.out.println(p1.equals(p2));
		System.out.println(p1==p2);
		
		String s1 = "hello";
		String s2 = "hello";
		System.out.println(s1.equals(s2));
	}
}
