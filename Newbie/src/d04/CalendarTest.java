//package org.whatisjava.util;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();//以后再说
		
		//设置日期时间分量
		c.set(Calendar.YEAR,2007);
		c.set(Calendar.MONTH,Calendar.JULY);
		c.set(Calendar.DATE,12);
		
		c.set(Calendar.HOUR,2);
		c.set(Calendar.MINUTE,20);
		c.set(Calendar.SECOND,10);
		c.set(Calendar.AM_PM,Calendar.PM);
		
		
		
		Date date = c.getTime();//返回对应的Date对象
		System.out.println(date);
		
		//获取日期时间分量
		int day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);
		
		
		Calendar c1 = Calendar.getInstance();
		c1.set(Calendar.YEAR,2008);
		c1.set(Calendar.MONTH,Calendar.AUGUST);
		c1.set(Calendar.DATE,31);
		
		System.out.println(c1.getTime());
		
		c1.add(Calendar.MONTH,1);
		System.out.println(c1.getTime());
		
		
		c1.add(Calendar.DATE,2);
		System.out.println(c1.getTime());
		

		
		
	}

}
