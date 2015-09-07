package org.whatisjava.core.init;

class SuperClass {
	private int x;
	SuperClass(int x1) {
		x = x1;
	}
	public void addX() {
		x++;
	}
	public int getX() {
		return x;
	}
}

class SubClass extends SuperClass {
	
	private int y;
	//理解继承中构造子的使用，假如父类没有无参的构造子，将会出错
	//子类中必须调用父类中的构造子
	SubClass(int x1, int y1)
	{
		super(x1);  //必须最先调用父类的构造子
		y = y1;
	}

	public void addY() {
		y++;
	}

	public int getY() {
		return y;
	}
	
}
