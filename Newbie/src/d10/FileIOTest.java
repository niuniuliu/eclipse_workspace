package org.nitpro.io1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileIOTest {

	// FileInputStream
	public void testFis() throws Exception {
		FileInputStream fis = new FileInputStream("3.txt");
		// int d = fis.read();
		// System.out.println((char)d);
		// d = fis.read();
		// System.out.println((char)d);
		// d = fis.read();
		// System.out.println(d);
		// fis.close();
		int d = -1;
		while ((d = fis.read()) != -1) {
			System.out.println(d);
		}
		fis.close();
	}

	// FileOutputStream
	public void testFos() throws Exception {
		FileOutputStream fos = new FileOutputStream("5.txt"); //可能去创建一个新的文件
		fos.write(123);
		fos.write(300);
		fos.close(); // flush
	}

	// BufferedOurputStream
	public void testBos() throws Exception {
		FileOutputStream fos = new FileOutputStream("4.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		bos.write(123);
		bos.close();
	}

	public void testCopy() throws Exception {
		FileInputStream fis = new FileInputStream("1.jpg");
		FileOutputStream fos = new FileOutputStream("2.jpg");
		int b = -1;
		while ((b = fis.read()) != -1) {
			fos.write(b);
		}
		fis.close();
		fos.close();
	}

	public void testCopy1() throws Exception {
		FileInputStream fis = new FileInputStream("1.jpg");
		FileOutputStream fos = new FileOutputStream("3.jpg");
		byte[] buffer = new byte[1024];
		int b = -1;
		while ((b = fis.read(buffer)) != -1) {
			fos.write(buffer,0,b);
		}
		fis.close();
		fos.close();
	}
	
	public void testCopy2() throws Exception{
		FileInputStream fis = new FileInputStream("1.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream("4.jpg");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int b = -1;
		while ((b = bis.read()) != -1) {
			bos.write(b);
		}
		bis.close();
		bos.close();
		
	}

	public static void main(String[] args) throws Exception {
		FileIOTest fiot = new FileIOTest();
		fiot.testFis();
		fiot.testFos();
		
//		long l = System.currentTimeMillis();
//		fiot.testCopy();
//		System.out.println(System.currentTimeMillis() - l);
//		
//		l = System.currentTimeMillis();
//		fiot.testCopy1();
//		System.out.println(System.currentTimeMillis() - l);
//		
//	    l = System.currentTimeMillis();
//		fiot.testCopy2();
//		System.out.println(System.currentTimeMillis() - l);
	}

}
