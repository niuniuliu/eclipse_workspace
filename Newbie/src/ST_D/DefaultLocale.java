import java.util.Locale;

public class DefaultLocale {
	public static void main(String[] args) {
		Locale lcl = Locale.getDefault();
		System.out.println("返回语言代码：" + lcl.getLanguage());
		System.out.println("返回地区代码：" + lcl.getCountry());
		System.out.println("返回语言名称：" + lcl.getDisplayLanguage());
		System.out.println("返回地区名称：" + lcl.getDisplayCountry());
		System.out.println("返回对此locale的描述：" + lcl.toString());
	}
}
