package org.nitpro.io1;

import java.io.*;

public class SeekTest {
	public static void main(String[] args) {
		File f = new File("data.txt");
		try {
			RandomAccessFile frw = new RandomAccessFile(f, "rw");
			double d1 = 123.456, d2 = 456.789;
			frw.writeDouble(d1);
			frw.writeDouble(d2);
			frw.writeDouble(d1 + d2);
			frw.writeDouble(d1 - d2);
			System.out.println(frw.length());
			frw.seek(0);
			System.out.println(frw.getFilePointer());
			System.out.println(frw.readDouble());
			System.out.println(frw.getFilePointer());
			System.out.println(frw.readDouble());
			System.out.println(frw.getFilePointer());
			System.out.println(frw.readDouble());
			System.out.println(frw.getFilePointer());
			System.out.println(frw.readDouble());
			System.out.println(frw.getFilePointer());			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
