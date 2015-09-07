package d02;

public class TestFor2 {
	public static void main(String[] args) {
		int k = 2;// 反正都是被执行一次
		for (; k < 8;) {
			System.out.println(k);
			k++; // 反正都是在出大括号前才被执行
		}
	}
}