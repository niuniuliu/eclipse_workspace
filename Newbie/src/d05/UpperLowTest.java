package org.nitpro.lang;

public class UpperLowTest {
	public static void main(String args[]) {
		String s = "ABAabb$&^$#BAAb898B#@%aa";
		String sUpper = s.toUpperCase();
		String sLow = s.toLowerCase();
		int upperNum = 0, lowNum = 0;
		for (int i = 0; i < s.length(); i++) {
			char cU = sUpper.charAt(i);
			char cL = sLow.charAt(i);
			char c = s.charAt(i);
			if (c != cU) {
				lowNum++;
			} else if (c != cL) {
				upperNum++;
			}
		}
		System.out.println("大写字母有 " + upperNum + " 个");
		System.out.println("小写字母有 " + lowNum + " 个");
		System.out.println("非字母有 " + (s.length() - upperNum - lowNum) + " 个");
	}
}
