package d02;

public class TestPrimary {
	public static void main(String[] args) {
		for (int m = 2; m <= 100; m++) {
			// int m = 13;
			boolean flag = true;
			for (int n = 2; n < m; n++) {
				if (m % n == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(m + " is prime");
			}
		}
	}

//	public static void main(String[] args) {
//		for (int j = 2; j <= 100; j++) {
//			if (isPrimary(j)) {
//				System.out.println(j);
//			}
//		}
//	}

	public static boolean isPrimary(int n) {
		boolean b = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				b = false;
				break;
			}
		}
		return b;
	}

}