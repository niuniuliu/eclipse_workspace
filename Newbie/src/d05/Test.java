class Test {
	private static void setString(String str1) {
		str1 = "a";
	}

	public static void main(String[] s) {
		String strtest = new String("abc");
		setString(strtest);
		System.out.println(strtest);
	}
}
