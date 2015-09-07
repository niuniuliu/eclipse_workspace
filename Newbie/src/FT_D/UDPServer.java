 package nitpro.socket;

import java.io.IOException;
import java.net.*;


public class UDPServer {
	
	public static void main(String[] args){
		try {
			DatagramSocket ds = new DatagramSocket(6088);
			byte[] buf = new byte[100];
			DatagramPacket dp = new DatagramPacket(buf,100);
			ds.receive(dp);
			System.out.println(new String(buf,0,dp.getLength()));
			String str = "hello kitty!";
			DatagramPacket dpSend = new DatagramPacket(str.getBytes(),str.length(),dp.getAddress(),dp.getPort());
			ds.send(dpSend);
			ds.close();
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
