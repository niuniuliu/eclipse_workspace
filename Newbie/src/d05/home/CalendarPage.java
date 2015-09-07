//package org.whatisjava.util;

import java.util.*;

/**
 * 根据所提交的数改变月历宽度
 * 
 * @author Administrator
 *
 */
public class CalendarPage {
	public static void kuandu(int j){
		for(int i=1;i<=j;i++){
			System.out.print(" ");
		}
	}
	/**
	 * 打印给定月份的月历
	 * 
	 * @param year 月历的年份
	 * @param month 月历的的月份
	 */
	public static void printCalendarPage(int year, int month,int k) {
		
		System.out.println(year + "-" + month);
		System.out.println("------------------------------------------");
		
		//
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, month - 1);
		c.set(Calendar.DATE, 1);

		System.out.print("Su");
		kuandu(k);
		System.out.print("Mo"); 
		kuandu(k);
		System.out.print("Tu"); 
		kuandu(k);
		System.out.print("We"); 
		kuandu(k);
		System.out.print("Th"); 
		kuandu(k);
		System.out.print("Fr"); 
		kuandu(k);
		System.out.print("Sa\n");
		
		int leadGap = c.get(Calendar.DAY_OF_WEEK) - 1;

		for (int i = 0; i < leadGap; i++) {
			System.out.print("  ");
			kuandu(k);
			
		}

		int date = 1;
		while (c.get(Calendar.MONTH) == month - 1) {
			if (date <= 9) {
				System.out.print(" ");
			}
			System.out.print(date);
			if ((leadGap + date) % 7 == 0) {
				System.out.println();
			} else{kuandu(k);}
				
			
			date++;
			c.set(Calendar.DATE, date);
		}
		System.out.println("\n------------------------------------------");
	}
}
