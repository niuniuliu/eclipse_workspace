package org.whatisjava.core;

public class SubClass extends SuperClass {
	public void action3() {
		f(); //不能直接操作，protected可以让子类访问，其他类不能用
	}
}
