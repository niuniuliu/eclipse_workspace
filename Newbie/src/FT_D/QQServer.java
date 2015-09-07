package org.nitpro.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class QQServer {
	public void test(){
		try{
			// ServerSocket负责在服务器段开辟一个通道(端口)
			//服务器端的套接字
			ServerSocket ssk = new ServerSocket(2001);
			while(true){
				Socket sk = ssk.accept();//accept等到一个客户端的网络连接
				InputStream is = sk.getInputStream();
				DataInputStream dis = new DataInputStream(is);
				
				String str = dis.readUTF();
				
				OutputStream os = sk.getOutputStream();
				DataOutputStream dos = new DataOutputStream(os);
				dos.writeUTF(str);
				dos.close();
//				System.out.println("来自客户端的消息:"+str);
				dis.close();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args){
		QQServer qs = new QQServer();
		qs.test();
	}
}
