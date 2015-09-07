package d01;

/**
 * @(#)Test3.java
 * 
 * 
 * @author
 * @version 1.00 2007/7/22
 */

public class Test3 {
	public static void main(String[] args) {
		boolean b;
		b = true;

		char c = 'a'; // char锟斤拷锟斤拷莸锟斤拷锟斤拷锟?

		byte b1 = 12; // 锟斤拷锟斤拷之锟斤拷锟阶拷锟斤拷锟揭拷锟斤拷锟斤拷强锟斤拷转锟斤拷锟斤拷只要锟斤拷锟斤拷锟斤拷围锟斤拷锟斤拷
		byte b2 = 34;
		byte b3 = (byte) (b1 + b2);
		System.out.println(b3);

		char c1 = 123;
		int i = 123;
		byte b4 = (byte) i;

		i = b2;
		double d = 12;
		int i1 = 123;
		i1 = (int) (d + i1);

		float f = 12.0f;
		System.out.print(f);
	}
}