package d02;

public class TestString {
	public static void main(String[] args) {
		//返回字符串的长度
		String str = "abc";
		int l = str.length();
		System.out.println(l);
		str = "你好";
		System.out.println(str.length());
		
		//返回指定下标的字符
		str = "ibmoraclebea";
		char c = str.charAt(5);
		System.out.println(c);
		
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
		
		//检索字符串 -1表示找不到
		String str1 = "sunjavaibmjava";
		String str2 = "java";
		int index = str1.indexOf(str2);
		System.out.println("index= " + index);
		
		//求子字符串
		String s1 = "javaibmoraclebea";
		String s2 = s1.substring(4,7);
		System.out.println(s2); 			
	}	
}