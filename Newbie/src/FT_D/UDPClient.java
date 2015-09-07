package nitpro.socket;

import java.io.IOException;
import java.net.*;

import com.sun.media.sound.DataPusher;

public class UDPClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			DatagramSocket ds =new DatagramSocket();
			String str = "this  is  a udp message";
			DatagramPacket dp = new DatagramPacket(str.getBytes(),str.length(),InetAddress.getByName("localhost"),6088);
			ds.send(dp);
			byte[] buf = new byte[100];
			DatagramPacket dpRec = new DatagramPacket(buf,100);
			ds.receive(dpRec);
			System.out.println(new String(buf,0,dpRec.getLength()));
			ds.close();
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
