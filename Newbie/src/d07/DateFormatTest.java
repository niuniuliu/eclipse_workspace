package org.whatisjava.util;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {

	public static void main(String[] args){
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL,Locale.GERMAN);
		Date date = new Date();
		String str = df.format(date);
		System.out.println(str);
	}
}
