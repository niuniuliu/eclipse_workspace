package d02;

public class LeapYear {
	public static void main(String args[]) {
		isLeapYear(2000);
	}

	public static void isLeapYear(int year) {
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.print(year + "年是闰年");
		} else {
			System.out.print(year + "年不是闰年");
		}
	}
}