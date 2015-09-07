package org.nitpro.io;

import java.io.*;

public class LineNumberreaderTest {
	public static void main(String[] args) {
		LineNumberReader lnr = new LineNumberReader(new InputStreamReader(
				System.in));
		lnr.setLineNumber(1000);
		String s = null;
		try {
			while ((s = lnr.readLine()) != null) {
				if (s.equalsIgnoreCase("exit"))
					break;
				System.out.println(lnr.getLineNumber());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
