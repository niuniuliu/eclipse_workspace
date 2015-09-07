package org.nitpro.socket;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;

public class TestA {
	public void test(){
		try{
			InetAddress addr = InetAddress.getByName("127.0.0.1");
			String str =addr.getHostAddress();
			boolean flag = addr.isLoopbackAddress();
			System.out.println(flag);
			System.out.println(str);
			
		}catch(Exception e){
			e.printStackTrace();
		}		
	}
	
	public void test2(){
		try{
			URL u = new URL("http://www.tsinghua.org");
			InputStream is = u.openStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			while(true){
				String str = br.readLine();
				if(str==null){
					break;
				}
				System.out.println(str);
			}			
		}catch(Exception e){
			e.printStackTrace();
		}		
	}
	
	public static void main(String[] args){
		TestA t = new TestA();
		t.test();
		t.test2();
	}
}
