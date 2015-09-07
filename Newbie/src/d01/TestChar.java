package d01;

public class TestChar {
	public static void main(String[] args) {
		for (char c = '\u4e00'; c <= '\u9fa5'; c++) {
			System.out.print(c);
		}
	}
}