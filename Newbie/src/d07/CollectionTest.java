package org.whatisjava.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.Vector;

public class CollectionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Vector的用法
		Vector vector = new Vector();
		vector.addElement(new Dog(1));
		vector.addElement(new Dog(2));
		vector.addElement(new Dog(3));

		System.out.println(vector);

		for (int i = 0; i < vector.size(); i++) {
			Dog dog = (Dog) vector.get(i);
			System.out.println(dog);
		}

		// Collection
		Collection c = new ArrayList();

		System.out.println(c.isEmpty());

		// add
		c.add(new Integer(100));
		c.add(new Integer(200));
		c.add(new Integer(300));

		System.out.println(c.isEmpty());

		System.out.println(c.size());

		System.out.println(c);

		// contains的逻辑是依赖于equals方法的
		Integer i = new Integer(100);
		System.out.println(c.contains(i));
		System.out.println(c.contains(new Integer(250)));

		Collection c1 = new ArrayList();
		c1.add(new Dog(1));
		c1.add(new Dog(2));
		c1.add(new Dog(3));
		System.out.println(c1.contains(new Dog(1)));

		// remove的逻辑和equals有关
		System.out.println(c1);
		c1.remove(new Dog(2));
		System.out.println(c1);

		// List
		List list = new ArrayList();

		list.add("ibm");
		list.add("sun");
		// add(int index,Object obj)
		// remove(int index)
		list.add(1, "hp");
		System.out.println(list);

		String str = (String) list.get(2);
		System.out.println(str);

		for (int j = 0; j < list.size(); j++) {
			System.out.println(list.get(j));
		}

		// ArrayList vs. LinkedList
		List number = new LinkedList();
		for (int j = 1; j <= 10000; j++) {
			number.add(new Integer(j));
		}
		long l = System.currentTimeMillis();

		for (int j = number.size() - 1; j >= 0; j--) {
			number.remove(0);
		}
		System.out.println(System.currentTimeMillis() - l);
		System.out.println(number);

		// Set
		Set set = new HashSet();
		set.add("ibm");
		set.add("sun");
		set.add("oracle");

		// Set不能重复,和equals有关和hashCode有关
		set.add("ibm");
		System.out.println(set);

		System.out.println(set.contains(new String("ibm")));

		//
		Set s1 = new HashSet();

		s1.add(new Dog(1));
		s1.add(new Dog(2));
		s1.add(new Dog(3));
		System.out.println(s1.contains(new Dog(1)));// false

		// ArrayList vs. HashSet
		Collection cc = new HashSet();
		l = System.currentTimeMillis();
		for (int j = 0; j < 10000; j++) {
			cc.add(new Integer(j));
		}
		System.out.println(System.currentTimeMillis() - l);

		l = System.currentTimeMillis();
		Random random = new Random();
		for (int j = 1; j <= 10000; j++) {
			
			cc.contains(new Integer(random.nextInt(10000)));
		}
		System.out.println(System.currentTimeMillis() - l);
	}

}
