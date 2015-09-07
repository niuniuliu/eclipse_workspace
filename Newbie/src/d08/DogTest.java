package org.nitpro.util;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class DogTest {
	public static void main(String[] args){
		List c = new LinkedList();
		c.add(new Dog(1,"one"));
		c.add(new Dog(2,"two"));
		c.add(new Dog(3,"three"));
		c.add(new Dog(4,"four"));
		c.add(new Dog(5,"five"));
		c.add(new Dog(6,"six"));
		c.add(new Dog(7,"seven"));
		c.add(new Dog(8,"eight"));
		c.add(new Dog(9,"nine"));
		c.add(new Dog(10,"ten"));
		
		Collections.sort(c);
		System.out.println(c);
	}

}
