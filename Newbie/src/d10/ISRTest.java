package org.nitpro.io1;

import java.io.*;

public class ISRTest {
	public static void main(String args[]) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = null;
		try {
			s = br.readLine();
			while (s != null) {
				if (s.equalsIgnoreCase("exit"))
					break;
				System.out.println(s.toUpperCase());
				s = null;//br.readLine();
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
