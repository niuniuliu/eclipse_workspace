
//只是为了说明超类中的一些private方法设置成private的原因
public class SuperClass {
	private int x;

	public void action1() {
		x++;
		f();
	}
	
	public void action2() {
		x--;
		f();
	}
	
	private void f() {
		//...
	}
	
}
