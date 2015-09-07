package d01;

/*public class FinalTest {
	public static void main(String[] args) {
		double PI = 3.1415926;
		PI = 3.14;
	}
}
*/

/*public class FinalTest{
	public static void main(String[] args){
		String a = "hello2";
		final String b = "hello";
		String d = "hello";
		String c = b + "2";
		String e = d + "2";
		System.out.println(a == c);
		System.out.println(a == e);
	}
}
*/


/*public class FinalTest {
    public static void main(String[] args)  {
        String a = "hello2"; 
        final String b = getHello();
        String c = b + "2"; 
        System.out.println((a == c));
 
    }
     
    public static String getHello() {
        return "hello";
    }
}*/

/*public class FinalTest {
    public static void main(String[] args)  {
        final MyClass myClass = new MyClass();
        System.out.println(++myClass.i);
 
    }
}
 
class MyClass {
    public int i = 0;
}

*/

/*public class FinalTest {
    public static void main(String[] args)  {
        MyClass myClass1 = new MyClass();
        MyClass myClass2 = new MyClass();
        System.out.println(myClass1.i);
        System.out.println(myClass1.j);
        System.out.println(myClass2.i);
        System.out.println(myClass2.j);
 
    }
}
 
class MyClass {
    public final double i = Math.random();
    public static double j = Math.random();
}



*/

public class FinalTest {
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		StringBuffer buffer = new StringBuffer("hello");
		myClass.changeValue(buffer);
		System.out.println(buffer.toString());
	}
}

class MyClass {
	void changeValue(final StringBuffer buffer) {
		buffer.append("world");
	}
}

