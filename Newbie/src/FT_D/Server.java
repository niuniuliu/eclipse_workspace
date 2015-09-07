package org.nitpro.socket;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public void start() {
		try {
			ServerSocket ssk = new ServerSocket(5001);
			while (true) {// 每一次循环表示一个客户端的连接
				Socket sk = ssk.accept();
				ServerThread st = new ServerThread(sk);
				st.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	class ServerThread extends Thread {
		Socket sk;

		public ServerThread(Socket sk) {
			this.sk = sk;
		}

		public void run() {
			try {
				InputStream is = sk.getInputStream();
				BufferedReader br = new BufferedReader(
						new InputStreamReader(is));
				while (true) {// 这里的每一次循环表示一句话
					String str = br.readLine();
					System.out.println(str);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Server s = new Server();
		s.start();
	}
}
