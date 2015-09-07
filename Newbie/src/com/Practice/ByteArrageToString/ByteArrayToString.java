package com.Practice.ByteArrageToString;

import java.io.UnsupportedEncodingException;

//import java.io.UnsupportedEncodingException;

/**
 * @author Crunchify.com
 */

public class ByteArrayToString {
	public static void main(String[] args) {
		String testString = "Crunchify Example on Byte[] to Stringn 中文";
		byte[] bytesData = testString.getBytes();

		System.out.println("testString : " + testString);

		// .getBytes on String will return Hashcode value
		System.out.println("\nbytesData : " + bytesData);

		// .toString() will return Hashcode value
		System.out.println("bytesData.toString() : " + bytesData.toString());

		// Create new String Object and assign byte[] to it
		String decodedData = new String(bytesData);
		System.out.println("\nText Decryted : " + decodedData);
		
		
		String decodedDataUsingUTF8 = null;
		try {
			// Best way to decode using "UTF-8"
			decodedDataUsingUTF8 = new String(bytesData, "UTF-8");
			System.out.println("Text Decryted using UTF-8 : " + decodedDataUsingUTF8);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		System.out.println(decodedData.length());
		System.out.println(decodedDataUsingUTF8.length());
		
	}
}