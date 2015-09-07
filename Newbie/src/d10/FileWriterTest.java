package org.nitpro.io1;

import java.io.*;

public class FileWriterTest {
	public static void main(String[] args) {
		FileWriter fw = null;
		FileReader fr = null;
		try {
			fw = new FileWriter("unicode.dat");
			for (int c = 0; c <= 50000; c++) {
				fw.write(c);
			}
			fw.close();
			
			fr = new FileReader("unicode.dat");
			int b = -1;
			while((b = fr.read()) != -1){
				System.out.println((char)b);
			}
		} catch (IOException e1) {
			System.out.println("文件写入错误");
			System.exit(-1);
		}
	}
}
