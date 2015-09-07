package org.nitpro.io1;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class TestDown {
	public static void main(String[] args) throws Exception {
		String str = "http://127.0.0.1:8080/1.bmp";
			//"http://blog.zjol.com.cn/UploadFile/2007-5/60321.58812377.mp3";
		// " HTTP://mat1.qq.com/musictop2/dq/0609/yyzajzfs.mp3";
		//
		URL url = new URL(str);

		HttpURLConnection conn = (HttpURLConnection) url.openConnection();

		BufferedInputStream bis = new BufferedInputStream(conn.getInputStream());
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("e:\\123.bmp"));
		int b = -1;
		while ((b = bis.read()) != -1) {
			bos.write(b);
			System.out.println("--1");
		}
		bis.close();
		bos.close();
		System.out.println("--2");
	}
}
