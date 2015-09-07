package org.whatisjava.core;

import java.util.Date;

public class ArrayTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 创建一个数组
		int[] a1 = new int[10];
		Date[] d1 = new Date[3];

		// 数组元素的赋值
		a1[0] = 100;
		a1[5] = 200;
		
		d1[0] = new Date();
		d1[2] = new Date();

		// 返回数组的长度
		int len = a1.length;
		System.out.println("length=" + len);

		// 数组的遍历
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
		}
		
		for(int i =0 ;i<d1.length; i++) {
			System.out.println(d1[i]);
			//System.out.println(d1[i].getTime()); //注意NullPointerException
		}
		
		/*
		 * for (int a : a1) { System.out.println(a); }
		 */
		

	}

}
