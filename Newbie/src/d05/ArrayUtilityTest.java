package org.whatisjava.core;

public class ArrayUtilityTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = { 2, 1, 3, 4, 5 };
		ArrayUtility.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

		ArrayUtility.shuffle(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
