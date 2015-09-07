package org.nitpro.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class QQClient {
	
	public void start(String message){
		try{
			//建立一个连接到172.16.2.10机器2000端口的连接
			Socket sk = new Socket("172.16.2.105",6000);
			
			OutputStream os = sk.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			dos.writeUTF(message);
		
			
			InputStream is = sk.getInputStream();//打开接收通道
			DataInputStream dis = new DataInputStream(is);
			String str = dis.readUTF();
			System.out.println("你提交的值为:"+str);
			
			dos.close();
			dis.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		QQClient qc = new QQClient();
		qc.start(args[0]);
	}

}
