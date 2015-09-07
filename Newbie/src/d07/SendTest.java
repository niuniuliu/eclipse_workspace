package org.whatisjava.core.interf;

public class SendTest {
	public static void main(String[]  args){
		Sender sender = new Sender(new ComputerImpl());
		sender.send("asdsadasd");
		
	}
}
