package org.nitpro.lang;

import java.util.Arrays;

public class TestString {
	public static void main(String[] args) throws Exception {
		// 返回索引指向的字符
		String ss = "ibm";
		char c = ss.charAt(1);
		System.out.println(c);

		// 取字符串的长度
		String s2 = "ibmsun";
		int i = s2.length();
		System.out.println(i);

		// 求 子字符串
		String s3 = s2.substring(3);
		System.out.println(s3);

		// 返回在指定字符串当中第一次出现的索引值
		int j = s2.indexOf("sun");
		System.out.println(j);

		// 按照指定的编码方式输出
		String s4 = "中国";
		byte[] byte1 = s4.getBytes("UTF-8");

		for (byte b : byte1) {
			System.out.println(b);
		}

		// 拆分字符串
		String s5 = "sun,ibm,oracle,db2,mysql";
		String[] strComputer = s5.split(",");

		for (String s6 : strComputer) {
			System.out.print(s6 + " ");
		}
		System.out.println();

		// 按照默认的字典顺序排序
		Arrays.sort(strComputer);
		for (String s6 : strComputer) {
			System.out.print(s6 + " ");
		}

	}
}