public class Hanoi {
	public static void main(String[] args) {
		hanoi(3, 'a', 'b', 'c');
	}

	/*
	 * 打印将n个盘子由 begin 通过 temp 移动到 end 的过程
	 * 
	 * @param n 盘子的数量 
	 * @param begin 移动的起点 
	 * @param temp 过度点 
	 * @param end 移动的终点
	 * 
	 */
	public static void hanoi(int n, char begin, char temp, char end) {
		if (n == 1) {
			System.out.println(begin + "---->" + end);
		} else{
			hanoi(n - 1, begin, end, temp);
			hanoi(1, begin, temp, end);
		    hanoi(n - 1, temp, begin, end);
		}
	}
}