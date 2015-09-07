package d02;

public class TestDoWhile {
	public static void main(String[] args) {
		/**
		 * 在这个过程中
		 * 1 先打印m变量的值
		 * 2.将m的值递增一个
		 * 3.判断m<15是否为true
		 */
		int m = 8;
		do {
			System.out.println(m);
			m++;
		} while (m < 15);
	}
}