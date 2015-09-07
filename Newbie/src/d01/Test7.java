package d01;

public class Test7 {
	public static void main(String[] args) {

		int i = get(20, 5);
		double j = 100.0 / 4;
		System.out.println(j);
	}

	public static int get(int x, int y) {
		return x > y ? x : y;
	}
}
