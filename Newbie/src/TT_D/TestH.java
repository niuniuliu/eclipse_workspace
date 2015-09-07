package org.nitpro.demo2;

public class TestH extends Thread{

	public void run(){
		for(int i=0;i<10000;i++){
			System.out.println(this.getName()+":"+i);
		}
	}
}
