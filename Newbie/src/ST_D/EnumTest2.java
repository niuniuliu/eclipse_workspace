package org.nitpro.news;

public class EnumTest2 {
	public void test(Sex s) {
		switch (s) {
		case male:
			System.out.println("男的");
			break;
		case female:
			System.out.println("女的");
			break;
		}
	}

	public static void main(String[] args) {
		String str = "male";
		EnumTest2 t = new EnumTest2();
		Sex s = Sex.valueOf(str);
		t.test(s);
	}

}
