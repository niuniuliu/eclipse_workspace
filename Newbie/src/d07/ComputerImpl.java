package org.whatisjava.core.interf;

public class ComputerImpl implements IComputer{
	public String process(String message){
		return message.toUpperCase();
	}

}
