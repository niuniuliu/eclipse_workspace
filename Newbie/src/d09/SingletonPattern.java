package org.nitpro.demo;

public class SingletonPattern
{
	private double r;

	private static SingletonPattern sp;
	private SingletonPattern()
	{
		r = java.lang.Math.random();
	}
	
	public static SingletonPattern getInstance()
	{
		if (sp==null)
		{
			sp = new SingletonPattern();
		}
		return sp;
	}
	public double getR()
	{
		return r;
	}
	
	public static void main(String args[])
	{
		SingletonPattern sp1 = SingletonPattern.getInstance();
		SingletonPattern sp2 = SingletonPattern.getInstance();
		System.out.println(sp1.getR());
		System.out.println(sp2.getR());
	}	
}