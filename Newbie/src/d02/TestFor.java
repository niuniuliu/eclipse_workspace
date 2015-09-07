package d02;

public class TestFor {
	public static void main(String[] args) {
		/*
		int i=0;该句只会被执行一次
		i<10;判断是否成立
		如果成立执行for循环的内容
		i++
		i<10
		执行for循环的内容
		i++
		直到i<10不满足条件为止，循环退出
		*/
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}
