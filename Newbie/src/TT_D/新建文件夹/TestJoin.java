

public class TestJoin {
	static int[] a = new int[20];

	public static void main(String args[]) {
		JoinThread r = new JoinThread();
		Thread t = new Thread(r);
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

		for (int i = 0; i < 20; i++) {
			System.out.println("Printing array a[" + i + "]:" + a[i]);
		}
	}

	// 内部类
	static class JoinThread implements Runnable {
		public void run() {
			for (int i = 0; i < 20; i++) {
				System.out.println("Initializing array a[ " + i + "]:"
						+ (i - 50));
				a[i] = i - 50;
			}
		}
	}
}