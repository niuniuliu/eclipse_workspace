package org.nitpro.socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ping {
	public static void main(String[] args) throws UnknownHostException{
		InetAddress ia;
		if(args.length <1){
			ia = InetAddress.getLocalHost();
		}else{
			ia = InetAddress.getByName(args[0]);			
		}
		System.out.println(ia);
	}
}
