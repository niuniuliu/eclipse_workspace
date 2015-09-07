package nitpro.mthread;

public class Test {
	public static void main(String[] args) {

		Queue q = new Queue();
		
		Consumer c = new Consumer(q);
		Producer p = new Producer(q);
		p.start();
		c.start();

	}

}

class Producer extends Thread {
	Queue q;

	Producer(Queue pq) {
		this.q = pq;
	}

	public  void run() {
		for (int i = 0; i < 10; i++) {
			q.put(i);
			System.out.println("Producer put " + i);
		}
	}
}

class Consumer extends Thread {
	Queue q;

	Consumer(Queue cq) {
		this.q = cq;
	}

	public  void run() {
		while (true) {
			System.out.println("Consumer get " + q.get());
		}
	}
}

class Queue {
	 int value;

	//洞里有无东西
	boolean flag = false;

	public synchronized void put(int i) {
		while(flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				
			}
		}
		value = i;
		flag = true;
		notifyAll();
		

	}

	public synchronized int get() {

		while (!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				
			}
		} 
		flag=false;
		notifyAll();
		return value;
	}
}
