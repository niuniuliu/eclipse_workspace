package org.nitpro.socket;

import java.io.*;
import java.net.*;

public class URLTest {
	public static void main(String args[]) {
		try {
			URL tirc = new URL("http://www.tsinghua.edu.cn/");
			BufferedReader in = new BufferedReader(new InputStreamReader(tirc
					.openStream()));
			String s;
			while ((s = in.readLine()) != null)
				System.out.println(s);
			in.close();
		} catch (MalformedURLException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
