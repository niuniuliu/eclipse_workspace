package d02;

public class TestWhile {
	public static void main(String[] args) {
		/**
		 *在下面的语句中
		 *1.先判断i<10是否为true
		 *2.如果为true,执行while循环体内的语句
		 *3.在循环体的执行中,改变i变量的值
		 *4.判断i<10是否为true
		 */		
		int i = 5;
		while (i < 10) {
			// 循环体
			System.out.println(i);
			i++;
		}
	}
}