package org.nitpro.io1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class CharIOTest {
	public void testOsw() throws Exception{

		FileOutputStream fos = new FileOutputStream("45.txt");
		OutputStreamWriter osw  = new OutputStreamWriter(fos,"GBK");
		osw.write('中');	
		osw.close();

	}
	
	public void testIsw() throws Exception{
		FileInputStream fis = new FileInputStream("45.txt");
		InputStreamReader osw  = new InputStreamReader(fis);
		int n = osw.read();
		System.out.println((char)n);
		osw.close();
	}
	
	public void FileWr() throws Exception {
		FileWriter fw = new FileWriter("hello.txt");
		fw.write("ahao,中国人??");
		fw.close();

		FileReader fr = new FileReader("hello.txt");
		int b = -1;
		while((b = fr.read()) != -1) {
			System.out.println(b);
		}
		fr.close();
	}
	
	public void testBR() throws Exception {
		String addr = "http://www.baidu.com";
		URL url = new URL(addr);
//		Properties prop = System.getProperties();
//		//使用代理服务器的时候使用
//		prop.setProperty("http.proxyHost", "192.168.100.5");
//		prop.setProperty("http.proxyPort", "11080");

		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		InputStream is = con.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		String str = null;
		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}
	}
	
	public static void main(String[] args) throws Exception{
		CharIOTest ciot = new CharIOTest();
		
		ciot.testOsw();
		ciot.testIsw();
		ciot.FileWr();
		//ciot.testBR();
		
	}

}
