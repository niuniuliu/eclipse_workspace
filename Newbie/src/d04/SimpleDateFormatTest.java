package org.whatisjava.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateFormatTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2008);
		c.set(Calendar.MONTH, Calendar.AUGUST);
		c.set(Calendar.DATE, 8);

		Date date = c.getTime();
		System.out.println(date);

		SimpleDateFormat sd = new SimpleDateFormat("yyyy年M月d日 E");
		String str = sd.format(date);
		System.out.println(str);
	}

}
