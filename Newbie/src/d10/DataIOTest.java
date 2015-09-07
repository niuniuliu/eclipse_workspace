package org.nitpro.io1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataIOTest {
	public void testDos() throws Exception{
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.dat"));
		dos.writeDouble(Math.PI);
		
		dos.close();
	}
	
	public void testDis() throws Exception{
		DataInputStream dis = new DataInputStream(new FileInputStream("data.dat"));
		double d = dis.readDouble();
		System.out.println(d);
	}
	
	public static void main(String[] args) throws Exception{
		DataIOTest diot = new DataIOTest();
		diot.testDos();
		diot.testDis();
	}

}
