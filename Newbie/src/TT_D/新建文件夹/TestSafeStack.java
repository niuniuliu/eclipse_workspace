public class TestSafeStack{
	public static void main(String[] args){
		SafeStack s = new SafeStack();
		//s.push(1);
		//s.push(2);
		PushThread r1 = new PushThread(s);
		PopThread r2 = new PopThread(s);
		PopThread r3 = new PopThread(s);
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);	
		Thread t3 = new Thread(r3);
		t1.start();
		t2.start();
		t3.start();
	}	
}