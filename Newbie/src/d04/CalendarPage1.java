//package org.nitpro.util;

import java.util.*;

//实现日历的一个方法
public class CalendarPage1 {
	
	/**
	 * 
	 * @param year
	 * @param month
	 */
	public static void printCalendarPage(int year, int month) {
		
		System.out.println(year + "-" + month);
		System.out.println("--------------------");

		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, month - 1);
		c.set(Calendar.DATE, 1);

		System.out.println("Su Mo Tu We Th Fr Sa");
		int leadGap = 0;
		leadGap = c.get(Calendar.DAY_OF_WEEK) - 1;

		for (int i = 0; i < leadGap; i++) {
			System.out.print("   ");
		}

		int date = 1;
		while (c.get(Calendar.MONTH) == month - 1) {
			if (date <= 9) {
				System.out.print(" ");
			}
			System.out.print(date);
			if ((leadGap + date) % 7 == 0) {
				System.out.println();
			} else
				System.out.print(" ");
			date++;
			c.set(Calendar.DATE, date);
		}
		System.out.println("\n--------------------");
	}

	public static void main(String[] args) {
		printCalendarPage(2007, 9);
		printCalendarPage(2008, 8);
	}
}
