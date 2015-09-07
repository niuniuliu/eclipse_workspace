package org.nitpro.util;

import java.util.*;

public class TokenizerTimeTest {
	public static void main(String args[]) {
		Date d = new Date();
		String date = d.toString();
		System.out.println(date);
		String time = date.substring(11, 20);

		StringTokenizer st = new StringTokenizer(time, ":");
		if (st.countTokens() == 3) {
			String t = "现在是" + st.nextToken() + "点" + st.nextToken() + "分"
					+ st.nextToken() + "秒";
			System.out.println(t);
		}
	}

}
