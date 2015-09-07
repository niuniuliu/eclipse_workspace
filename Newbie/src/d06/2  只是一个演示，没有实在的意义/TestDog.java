package org.whatisjava.core;

public class TestDog {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.name = "大黄";
		dog.enjoy();
		
		Animal animal = new Dog();
		animal.name = "dahuang";
		animal.enjoy();
	}
}
