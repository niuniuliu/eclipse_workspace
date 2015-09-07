package d02;

public class TestBreak {
	public static void main(String[] args) {
		for (int k = 2; k < 6; k++) {
			if (k == 4) {
				break;
			}
			System.out.println(k);
		}
	}
}