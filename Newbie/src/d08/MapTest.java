package org.nitpro.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(new Integer(2), "one");
		map.put(new Integer(1), "two");
		map.put(new Integer(3), "three");

		System.out.println(map.containsKey(new Integer(2)));
		System.out.println(map.containsKey("four"));

		System.out.println(map.get(Integer.valueOf(1)));

		Set keys = map.keySet();
		System.out.println(keys);
		Iterator it = keys.iterator();
		while (it.hasNext()) {
			Integer key = (Integer) it.next();
			String value = (String) map.get(key);
			System.out.println("key=" + key + ",value=" + value);
		}
		
		//map算法演示
		test("abccdabadeffeg");
	}

	/**
	 * 打印出字符串str中,每个字符出现的次数
	 * 
	 * @param str
	 */
	public static void test(String str) {
		Map map = new HashMap();
		for (int i = 0; i < str.length(); i++) {
			Character c = new Character(str.charAt(i));
			if (map.containsKey(c)) {
				int num = ((Integer) map.get(c)).intValue();
				map.put(c, new Integer(num + 1));
			} else {
				map.put(c, new Integer(1));
			}
		}
		System.out.println(map);
	}
}
