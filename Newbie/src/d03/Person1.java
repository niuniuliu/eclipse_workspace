package d03;

class Person {
	public int age;

	public void setAge(int i) {
		if (i < 0)
			return;
		age = i;
	}

	public int getAge() {
		return age;
	}
}

public class Person1 {
	public static void main(String args[]) {
		Person b = new Person();
		b.age = -1000;
		b.setAge(16);
		System.out.println(b.getAge());
	}
}
