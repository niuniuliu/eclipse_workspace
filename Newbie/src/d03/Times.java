package d03;

public class Times {
	public static int getTimes(String s1, String s2) {
		int num = 0;
		while ((s1.indexOf(s2)) != -1) {
			num += 1;
			s1 = s1.substring(s1.indexOf(s2) + s2.length());
		}
		return num;
	}

	public static void main(String[] args) {
		String a = "abcfhabcjjcabcas——abc";
		String b = "abc";
		int i = getTimes(a, b);
		System.out.println(i);
	}
}