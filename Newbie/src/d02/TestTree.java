package d02;

public class TestTree{
		public static void main(String[] args){
		for(int n=1;n<=1000;n++){
			//int i = 153;
			/* int result = 0;
			for(int j = n;j > 0;j/=10){
				int b ;
				b = j%10;
				result += b*b*b;
			}*/
			int result = getNumber(n);
			if(result == n){
				System.out.println(n);
			}
		}
	}

	/**
	* 返回一个水仙花数值
	*
	* @param n1 传入一个值并判断他是否为水仙花数
	* 
	* return 一个水仙花数
	*/
	public static int getNumber(int n)
	{
		int result = 0;
		for(int j = n;j > 0;j/=10){
				int b ;
				b = j%10;
				result += b*b*b;
		}
		return result;
	}
}