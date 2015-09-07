package org.nitpro.io1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) {
		File file = new File("11.txt");
		try {

			FileReader fr = new FileReader(file);

			System.out.println(file.canWrite());
			System.out.println(file.exists());
			System.out.println(file.getAbsolutePath());
		} catch (FileNotFoundException e) {
			try {
				file.createNewFile();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
}
