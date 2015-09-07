﻿package org.nitpro.io1;

import java.io.*;

public class PrintTest {
	public static void main(String[] args) {
		PrintStream ps = null;
		try {
			FileOutputStream fos = new FileOutputStream("log.txt");
			ps = new PrintStream(fos);
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (ps != null) {
			System.setOut(ps);
		}

		int ln = 0;

		for (char c = 0; c <= 60000; c++) {
			System.out.print(c + " ");
			if (ln++ >= 100) {
				System.out.println();
				ln = 0;
			}
		}
	}
}
