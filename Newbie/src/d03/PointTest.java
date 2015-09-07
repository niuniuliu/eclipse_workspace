package d03;

public class PointTest {
	public static void main(String[] args) {
		Point p = new Point();
		Point p1 = new Point();

		p.px = 2;
		p.py = 3;
		p1.px = 4;
		p1.py = 5;

		int d = p.distance();
		System.out.println(d);
		System.out.println(p1.distance());

		p.move(1, 1);
		System.out.println(p.px);
	}
}