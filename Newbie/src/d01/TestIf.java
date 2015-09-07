package d01;

public class TestIf {
	public static void main(String args[]) {
		int a = 6, b = 3, c = 9;
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		if (b > c) {
			int temp = b;
			b = c;
			c = temp;
		}
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		System.out.println("" + a + "," + b + "," + c);
	}
}
