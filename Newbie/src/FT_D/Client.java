package org.nitpro.socket;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	
	public void start(){
		try{
			Socket sk = new Socket("127.0.0.1",5001);			
			OutputStream os = sk.getOutputStream();			
			PrintWriter pw = new PrintWriter(os,true);
			while(true){
				InputStream is = System.in;
				BufferedReader br = new BufferedReader(new InputStreamReader(is));
				String str = br.readLine();
				if(str==null){
					break;
				}			
				pw.println(str);
			}			
			pw.close();			
		}catch(Exception e){
			e.printStackTrace();
		}
	}	
	
	public static void main(String[] args){
		Client c = new Client();
		c.start();
	}
}
