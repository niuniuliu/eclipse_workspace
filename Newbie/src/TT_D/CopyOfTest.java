package nitpro.mthread;

public class CopyOfTest {
	public static void main(String[] args) {
		Queue1 q = new Queue1();
		Consumer1 c = new Consumer1(q);
		Producer1 p = new Producer1(q);
		p.start();
		c.start();

	}

}

class Producer1 extends Thread {
	Queue1 q;

	Producer1(Queue1 pq) {
		this.q = pq;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			q.put(i);
			// System.out.println("Producer put " + i);
		}
	}
}

class Consumer1 extends Thread {
	Queue1 q;

	Consumer1(Queue1 cq) {
		this.q = cq;
	}

	public void run() {
		while (true) {
			// System.out.println("Consumer get " + q.get());
			q.get();
		}
	}
}

class Queue1 {
	int value;

	// 洞里有无东西
	boolean flag = false;

	public synchronized void put(int i) {
		while (flag) {
			try {
				wait();
			} catch (InterruptedException e) {

			}
		}
		value = i;
		flag = true;
		System.out.println("Producer put " + i);
		notifyAll();
	}

	public synchronized int get() {

		while (!flag) {
			try {
				wait();
			} catch (InterruptedException e) {

			}
		}
		flag = false;
		System.out.println("Consumer get " + value);
		notifyAll();
		return value;
	}
}
