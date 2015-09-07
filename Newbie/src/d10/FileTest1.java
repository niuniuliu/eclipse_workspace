package org.nitpro.io1;

import java.io.*;

public class FileTest1 {
	public static void main(String[] args) {
		String separator = File.separator; //即为 "\\"  /
		String filename = "myfile.txt";
		String directory = "mydir1" + separator + "mydir2"; 
		File f = new File(directory, filename);
		if (f.exists()) {
			System.out.println("文件名：" + f.getAbsolutePath());
			System.out.println("文件大小：" + f.length());
		} else {
			f.getParentFile().mkdirs();
			try {
				f.createNewFile();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
