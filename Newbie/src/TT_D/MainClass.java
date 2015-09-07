package org.nitpro.thread;

public class MainClass {

	public static void main(String[] args) {
		MyThread1 th1 = new MyThread1();
		th1.start();
		
		MyThread2 th2 = new MyThread2();
		th2.start();

	}

}
