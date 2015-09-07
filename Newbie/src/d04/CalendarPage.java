//package org.nitpro.util;

import java.util.Calendar;

public class CalendarPage {

	/**
	 * 
	 * @param year
	 * @param month
	 */
	public static void printCalendarPage(int year, int month) {
		
		System.out.println(year + "-" + month);
		System.out.println("--------------------");

		//
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, month - 1);
		c.set(Calendar.DATE, 1);

		System.out.println("Su Mo Tu We Th Fr Sa");

		int leadGap = c.get(Calendar.DAY_OF_WEEK) - 1;

		for (int i = 0; i < leadGap; i++) {
			System.out.print("   ");
		}

		int n = c.getActualMaximum(Calendar.DATE);     // 计算最大的天数
		for (int date = 1; date <= n; date++) {
			if (date <= 9) {
				System.out.print(" ");
			}
			System.out.print(date);
			if ((leadGap + date) % 7 == 0) {
				System.out.println();
			} else
				System.out.print(" ");
			c.set(Calendar.DATE, date);
		}
		System.out.println("\n--------------------");
	}
}
