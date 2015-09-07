package org.whatisjava.util;

import java.util.Arrays;

public class StringTest {

	/**
	 * String类的方法 
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// 返回字符串的长度
		String str = "abc";
		int l = str.length();
		System.out.println(l);
		str = "你好";
		System.out.println(str.length());

		// 返回指定下标的字符
		str = "ibmoraclebea";
		char c = str.charAt(5);
		System.out.println(c);

		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}

		// 检索字符串 -1表示找不到
		String str1 = "sunjavaibmjava";
		String str2 = "java";

		int index = str1.indexOf(str2);
		System.out.println("index=" + index);

		index = str1.indexOf(str2, 5);
		System.out.println("index=" + index);

		// 求子字符串
		String s1 = "javaibmoraclebea";
		String s2 = s1.substring(4, 7);
		System.out.println(s2);
		String s3 = s1.substring(4);
		System.out.println(s3);

		// 求字符串的特定编码
		String s5 = "中国";
		byte[] bb1 = s5.getBytes("GBK");
		for (int i = 0; i < bb1.length; i++) {
			System.out.print(bb1[i] + " ");
		}
		System.out.println();

		bb1 = s5.getBytes("UTF-8");
		for (int i = 0; i < bb1.length; i++) {
			System.out.print(bb1[i] + " ");
		}
		System.out.println();

		// 拆分字符串
		String s6 = "ibm,sun,oracle,bea,hp,apple";
		String[] ss = s6.split(",");
		for (int i = 0; i < ss.length; i++) {
			System.out.println(ss[i]);
		}
		//按照默认的字典顺序就行排序
		Arrays.sort(ss);
		for (int i = 0; i < ss.length; i++) {
			System.out.println(ss[i]);
		}
		//假如有一个狗的对象，我们能不能对狗进行排序


	}

}
