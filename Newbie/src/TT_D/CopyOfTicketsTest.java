package nitpro.mthread;

import sun.security.krb5.internal.Ticket;

public class CopyOfTicketsTest {
	public static void main(String[] args) {
		TicketThread1 tt = new TicketThread1();
		new Thread(tt).start();
		
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		tt.b = true;
		new Thread(tt).start();
		// new Thread(tt).start();
		// new Thread(tt).start();

	}
}

class TicketThread1 implements Runnable {
	int tickets = 50;

	Object obj = new Object();

	boolean b = false;

	public void run() {
		if (!b) {
			while(true)
				sell();
		} else {
			while (true) {
				synchronized (obj) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (this) {
						if (tickets > 0) {
							System.out.println("1"+Thread.currentThread().getName()
									+ ":" + tickets);
							--tickets;
						}
					}
				}
			}
		}
	}

	public synchronized void sell() {
		synchronized (obj) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (tickets > 0) {
				System.out.println(Thread.currentThread().getName() + ":"
						+ tickets);
				--tickets;
			}
		}
	}
}
