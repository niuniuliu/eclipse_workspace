//package org.whatisjava.util;

import java.util.Random;

public class RandomTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 产生随机整数
		Random r = new Random();
		for (int i = 0; i <= 2; i++) {
			System.out.println(r.nextInt(9));
		}
		
		for(int i = 1;i<=100;i++) {
			print();
		}

	}

	public static void print() {
		int n = 5;
		char[] letters = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
				'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
				'W', 'X', 'Y', 'Z' };
		boolean[] isSelected = new boolean[26];

		char[] result = new char[n];

		Random random = new Random();

		for (int i = 0; i < result.length; i++) {
			int index;
			do {
				index = random.nextInt(26);
			} while (isSelected[index]);
			result[i] = letters[index];
			isSelected[index] = true;
		}
		
		for(int i = 0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
		System.out.println();
	}

}
