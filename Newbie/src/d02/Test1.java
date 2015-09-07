package d02;

public class Test1 {
	/**
	* 程序的主入口
	* 
	* @param args
	* 无返回值
	*/

	public static void main(String[] args) {
		int result = 0;
		for (int i = 1; i < 100; i += 2) {
			result += i;
		}
		System.out.println(result);
	}
}