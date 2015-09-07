package nitpro.mthread;

public class MutiThread {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		//mt.start();
		new Thread(mt).start();
		new Thread(mt).start();
		new Thread(mt).start();
		new Thread(mt).start();
		
		while (true)
			System.out.println(Thread.currentThread().getName());
	}
}

class MyThread implements Runnable // extends Thread 
{
	int index;
	public void run() {
		//int index = 0;
		while (true) {
//			if (index == 100000)
//				break;
			System.out.println(Thread.currentThread().getName() + ":" + ++index);
//			yield();
		}
	}
}
