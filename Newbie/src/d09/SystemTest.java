package org.nitpro.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SystemTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(str);
	}
}
