package org.whatisjava.core;

//讲继承的时候不用写成abstract,后来再讨论，然后引入抽象类的特性
public abstract class Animal {
	String name;
	public abstract void enjoy()
	{
		System.out.println("叫声");		
	}
}
