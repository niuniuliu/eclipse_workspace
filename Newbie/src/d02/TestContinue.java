package d02;

public class TestContinue {
	public static void main(String[] args) {
		for (int k = 2; k < 6; k++) {
			if (k == 3) {
				continue;
			}
			System.out.println(k);
		}
	}
}