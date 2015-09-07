package org.whatisjava.core.interf;
// 1
public class Sender {
	//一种方法，因为经常用到，就把加密作为这个类的成员变量
	private IComputer e;
	public Sender(IComputer e1){
		e = e1;
	}
	public void send(String message)
	{
		String message1 = e.process(message); 
		//.....发送
		System.out.println(message1);
	}

}
