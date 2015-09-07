package nitpro.mthread;

import sun.security.krb5.internal.Ticket;

public class TicketsTest {
	public static void main(String[] args) {
		TicketThread tt = new TicketThread();
		new Thread(tt).start();
		new Thread(tt).start();
		new Thread(tt).start();
		new Thread(tt).start();

	}
}

class TicketThread implements Runnable {
	int tickets = 50;
	Object obj = new Object();
	public void run() {
		while (true) {
			/*synchronized (obj) {
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
			}*/
			sell();
		}
	}
	
	public synchronized void sell(){
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
