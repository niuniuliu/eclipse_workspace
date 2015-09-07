package org.nitpro.lang;

public class IntegerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Integer i = new Integer(1);
		Integer j = new Integer(2);
		Integer k = new Integer(i.intValue() + j.intValue());
		System.out.println(k);

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);

		// String解析成int
		String str = "123";
		int a = Integer.parseInt(str);
		System.out.println("a=" + a);

		String s1 = Integer.toOctalString(15);
		System.out.println(s1);

		// 创建Integer对象
		Integer l1 = new Integer(1);
		Integer l2 = new Integer(1);
		System.out.println(l1 == l2);

		Integer l3 = Integer.valueOf(1);
		Integer l4 = Integer.valueOf(1);
		System.out.println(l3 == l4);
	}
}
