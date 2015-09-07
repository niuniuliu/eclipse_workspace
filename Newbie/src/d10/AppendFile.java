package org.nitpro.io1;

import java.io.*;

public class AppendFile {
	public static void main(String[] args) {
		String toAppend = args[0];
		try {
			int i = 0;
			String record = new String();
			String toCn = null;
			// 处理中文问题
			toCn = new String(toAppend.getBytes("GBK"), "ISO8859_1");

			RandomAccessFile rf1 = new RandomAccessFile("c:\\toAppend.txt",
					"rw");
			rf1.seek(rf1.length());
			rf1.writeBytes(toCn + "\n");
			rf1.close();

			RandomAccessFile rf2 = new RandomAccessFile("c:\\toAppend.txt", "r");
			String outCn = null;
			while ((record = rf2.readLine()) != null) {
				i++;
				// 处理中文问题
				outCn = new String(record.getBytes("ISO8859_1"), "GBK");
				System.out.println("Line " + i + ":" + outCn);
			}
			rf2.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
