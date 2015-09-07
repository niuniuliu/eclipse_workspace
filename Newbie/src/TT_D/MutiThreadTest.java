package nitpro.mthread;

public class MutiThreadTest {
	public static void main(String[] args) {
		MyThread2 mt = new MyThread2();
		// mt.start();
		// new Thread(mt).start();
		// new Thread(mt).start();
		// new Thread(mt).start();
		// new Thread(mt).start();
		mt.getThread().start();
		mt.getThread().start();
		mt.getThread().start();
		mt.getThread().start();

		while (true)
			System.out.println(Thread.currentThread().getName());
	}
}

class MyThread2 // implements Runnable // extends Thread
{
	int index;
	private class InnerThread extends Thread {
		public void run() {
			System.out.println(getName() + ":" + ++index);
		}
	}
	
	public Thread getThread(){
		return new InnerThread();
	}
}
