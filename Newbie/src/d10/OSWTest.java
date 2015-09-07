package org.nitpro.io1;

import java.io.*;

public class OSWTest {
	public static void main(String[] args) {
		try {
			OutputStreamWriter osw = new OutputStreamWriter(
					new FileOutputStream("char.txt"));
			osw.write("mircosoftibmsunapplehp");
			System.out.println(osw.getEncoding());
			osw.close();

			osw = new OutputStreamWriter(
					new FileOutputStream("char.txt", true), "ISO8859_1");
			osw.write("mircosoftibmsunapplehp");
			System.out.println(osw.getEncoding());
			osw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
