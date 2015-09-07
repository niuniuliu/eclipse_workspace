import java.util.Locale;
import java.text.NumberFormat;

public class CurFormat {
	public static void main(String[] args) {
		// 需要格式化的金钱
		double dbl = 1234000.567;
		// 设定三个locale
		Locale cnLocale = new Locale("zh", "CN");
		Locale jpLocale = new Locale("ja", "JP");
		Locale usLocale = new Locale("en", "US");
		// 得到三个locale对应的NumberFormat对象
		NumberFormat cnNf = NumberFormat.getCurrencyInstance(cnLocale);
		NumberFormat jpNf = NumberFormat.getCurrencyInstance(jpLocale);
		NumberFormat usNf = NumberFormat.getCurrencyInstance(usLocale);
		// 将上面的double数据格式化输出
		System.out.println("China Currency Format:" + cnNf.format(dbl));
		System.out.println("Japan Currency Format:" + jpNf.format(dbl));
		System.out.println("US Currency Format:" + usNf.format(dbl));
	}
}
