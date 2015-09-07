package d02;

public class FebLash{
	public static void main(String[] args){
		long n = febLash1(5);
		System.out.println(n);
		n = febLash2(5);
		System.out.println(n);
	}

	//feblash数列的反例，千万不能用这个！！！！
	public static long febLash1(int n){
		if(n==1 || n==2){
			return 1;
		}else{
			return febLash1(n-1) + febLash1(n-2);
		}
	}

	/**
	 *返回费伯拉希数列的第n项的值
	 *
	 *@param n 要返回的项数
	 *
	 *@return 第n项的值
	 *
	 */
	public static long febLash2(int n){
		if(n==1 || n==2)
			return 1;
		int n1 = 1;
		int n2 = 1;		
		for(int i=3;i<=n;i++){
			n2 = n1 + n2;
			n1 = n2 - n1;
		}
		return n2;
	}
}