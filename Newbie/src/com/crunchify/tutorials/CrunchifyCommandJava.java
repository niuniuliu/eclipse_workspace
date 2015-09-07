package com.crunchify.tutorials;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author Crunchify.com
 * 
 */

public class CrunchifyCommandJava {
	public printOutput getStreamWrapper(InputStream is, String type) {
		return new printOutput(is, type);
	}

	public static void main(String[] args) {

		Runtime rt = Runtime.getRuntime();
		CrunchifyCommandJava rte = new CrunchifyCommandJava();
		printOutput errorReported, outputMessage;

		try {
			Process proc = rt.exec("ls /Users/<username>/Desktop");
			// Process proc = rt.exec("mkdir /Users/<username>/Desktop/test1");
			// Process proc = rt.exec("ping http://crunchify.com");
			errorReported = rte
					.getStreamWrapper(proc.getErrorStream(), "ERROR");
			outputMessage = rte.getStreamWrapper(proc.getInputStream(),
					"OUTPUT");
			errorReported.start();
			outputMessage.start();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private class printOutput extends Thread {
		InputStream is = null;

		printOutput(InputStream is, String type) {
			this.is = is;
		}

		public void run() {
			String s = null;
			try {
				BufferedReader br = new BufferedReader(
						new InputStreamReader(is));
				while ((s = br.readLine()) != null) {
					System.out.println(s);
				}
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}
}