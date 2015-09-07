package d03;

public class Point {
	int px;
	int py;

	public int distance() {
		return px * px + py * py;
	}

	public void move(int dx, int dy) {
		px += dx;
		py += dy;
	}
}