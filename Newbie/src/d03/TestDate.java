package d03;

import java.util.Date;

public class TestDate {
	
	public static void main(String[] args) {
		Date date = new Date();
		
		System.out.println(date);
		
		long longTime = date.getTime();
		System.out.println(longTime);
		longTime -= (24 * 60 * 60 * 1000) * 10;

		date.setTime(longTime);
		
		System.out.println(date);
		System.out.println();
	}
}
