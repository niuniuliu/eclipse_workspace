package org.whatisjava.core;

import java.util.Random;

/**
 * 
 * @author steven
 */
public class ArrayUtility {
	/**
	 * 对int类型的数组进行排序
	 * 
	 * @param array
	 */
	public static void sort(int[] array) {
		int len = array.length;
		for (int i = 0; i < len - 1; i++) {
			boolean isSwap = false;
			for (int j = len - 1; j > i; j--) {
				if (array[j] < array[j - 1]) {
					int temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
					//swap(array, j, j - 1);
					isSwap = true;
				}
			}
			if (!isSwap) {
				break;
			}
		}
	}

	/**
	 * 随机打乱数组的顺序
	 * 
	 * @param array
	 */
	public static void shuffle(int[] array) {
		Random r = new Random();
		for (int i = array.length; i > 1; i--) {
			int index = r.nextInt(i);
			// int temp = array[i - 1];
			// array[i - 1] = array[index];
			// array[index] = temp;
			swap(array, i - 1, index);
		}
	}

	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	/**
	 * 
	 * @param array
	 */
	public static void sort(double[] array) {

	}
}
