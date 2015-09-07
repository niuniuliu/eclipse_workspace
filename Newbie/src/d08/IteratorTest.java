package org.nitpro.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class IteratorTest {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("one");
		c.add("two");
		c.add("three");

		Iterator it = c.iterator();
		while (it.hasNext()) {
			String str = (String) it.next();
			System.out.println(str.toUpperCase());
		}

		Collection c1 = new HashSet();
		c1.add(Integer.valueOf(1));
		c1.add(Integer.valueOf(2));
		c1.add(Integer.valueOf(3));

		Iterator it1 = c1.iterator();

		while (it1.hasNext()) {
			Integer k = (Integer) it1.next();
			if (k.intValue() < 3) {
				System.out.println(k);
			}
		}

		Collection c2 = new LinkedList();
		c2.add(Integer.valueOf(1));
		c2.add(Integer.valueOf(2));
		c2.add(Integer.valueOf(3));

		Iterator it2 = c2.iterator();
		while (it2.hasNext()) {
			Integer k = (Integer) it2.next();
			if (k.intValue() < 2) {
				// c2.remove(k); // 不可以这么用
				it2.remove();
				System.out.println(k);
			}
		}
	}
}
