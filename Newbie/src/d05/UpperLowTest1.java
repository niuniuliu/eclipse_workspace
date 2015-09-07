package org.nitpro.lang;

public class UpperLowTest1 {
	public static void main(String args[]) {
		String s = "ABAabb$&^$#BAAb898B#@%aa";
		int upper = 0;
		int lower = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'A' && c <= 'Z')
				upper++;
			if (c >= 'a' && c <= 'z')
				lower++;
		}
		System.out.println(upper);
		System.out.println(lower);
		System.out.println(s.length() - upper - lower);
	}
}
